package reglasasociacion;

import Utilidades.Archivos;
import Utilidades.Operaciones;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainController {

    private DefaultTableModel modelo;
    private static String[] column_names;
    private JProgressBar bar;
    Operaciones op = new Operaciones();
    JTable tabla = null;

    /*Proceso Principal de Tratamiento de datos*/
    public DefaultTableModel procesarDatos(int umbralPorcentaje, JProgressBar bar, JTable tabla) {
        this.bar = bar;
        this.tabla = tabla;
        int totalRegistros = tabla.getRowCount();
        int registrosSoporte = getCountRes(umbralPorcentaje, totalRegistros);
        //Se arma la lista anidada con todos los datos preprocesados
        List<List<String>> matrix = this.getMatrixData(tabla);
        //Se arma la lista anidada con todo los datos diferentes
        List<List<String>> matrixDistinct = this.getMatrixDistinct(matrix);
        List<List<DTO>> listaDepurada = removeNotFrecuently(matrixDistinct, matrix, registrosSoporte);
        return colocarDatosTabla(listaDepurada);
    }

    /*Extrae informacion desde el archivo y retorna modelo*/
    public DefaultTableModel extraerDatos(String path) {
        File archivo = new File(path);
        List<String> listaLineas = new Archivos().leer(archivo);
        if (listaLineas.size() > 0) {
            column_names = listaLineas.get(0).split(",");
            for (int i = 0; i < column_names.length; i++) {
                column_names[i] = column_names[i].toUpperCase();
            }
            modelo = new DefaultTableModel(column_names, 0);
            listaLineas.remove(0);//Removemos encabezados
            listaLineas.stream().map((linea) -> linea.split(",")).forEachOrdered((array) -> {
                modelo.addRow(array);
            });
        }
        return modelo;
    }
/*Genera el Modelo de la Tabla de Salida insertando como parametro la lista de elementos comunes*/
    public DefaultTableModel colocarDatosTabla(List<List<DTO>> listaDepurada) {
        modelo = new DefaultTableModel();
        String[] nombresColumnasModificados = new String[tabla.getColumnCount()];
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            nombresColumnasModificados[i] = tabla.getColumnName(i);
        }
        int j = 0;
        for (List<DTO> listaDTO : listaDepurada) {
            Object[] columna = listaDTO.toArray();
            modelo.addColumn(nombresColumnasModificados[j], columna);
            j++;
        }
        return modelo;
    }
/*Metodo Auxiliar que genera la lista hija en getMatrixData*/
    private List<String> ensamblarLista(JTable tabla, int column) {
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            Object dato = tabla.getValueAt(i, column);
            lista.add((String) dato);
        }
        return lista;
    }
/*Genera una Matrix de Listas con los elementos totales de los datos de entrada*/
    List<List<String>> getMatrixData(JTable tabla) {
        op.colocarValorProgressBar(0, bar);
        List<List<String>> matrix = new ArrayList();
        for (int j = 0; j < tabla.getColumnCount(); j++) {
            op.colocarValorProgressBar(j * tabla.getColumnCount() / 100, bar);
            List<String> lista = ensamblarLista(tabla, j);
            matrix.add(lista);
        }
        op.colocarValorProgressBar(100, bar);
        return matrix;
    }

    /**/
    public List<String> getDistinct(List<String> lista) {
        List<String> distinct = lista.stream().distinct().collect(Collectors.toList());
        return distinct;
    }
/*Genera una Matrix de Listas con los elementos unicos de cada columna*/
    public List<List<String>> getMatrixDistinct(List<List<String>> matrix) {
        op.colocarValorProgressBar(0, bar);
        List<List<String>> matrixDistinct = new ArrayList();
        matrix.forEach((List<String> vector) -> {
            matrixDistinct.add(getDistinct(vector));
        });
        op.colocarValorProgressBar(100, bar);
        return matrixDistinct;
    }

    public long getMatchCount(List<String> lista, String dato) {
        long count = lista.stream().filter(t -> t.equals(dato)).count();
        return count;
    }

    public List<List<DTO>> removeNotFrecuently(List<List<String>> matrixDistinct, List<List<String>> matrix, int umbral) {
        List<List<DTO>> xMatrixDistinct = new ArrayList();
        op.colocarValorProgressBar(0, bar);
        for (int i = 0; i < matrixDistinct.size(); i++) {
            op.colocarValorProgressBar(i * 100 / matrixDistinct.size(), bar);
            List<DTO> lista = new ArrayList();
            xMatrixDistinct.add(lista);
            for (int j = 0; j < (matrixDistinct.get(i).size()); j++) {
                String pista = matrixDistinct.get(i).get(j);
                long count = getMatchCount(matrix.get(i), matrixDistinct.get(i).get(j));
                if (count > umbral) {
                    DTO dto = new DTO(pista, count);
                    xMatrixDistinct.get(xMatrixDistinct.size() - 1).add(dto);
                }
            }
        }
        op.colocarValorProgressBar(100, bar);
        return xMatrixDistinct;
    }

    /*Calcula avance en porcentaje para barra de progreso*/
    int getCountRes(int umbral, int registros) {
        return (umbral * registros) / 100;
    }

    /*Elimina columna de JTable*/
    void borrarColumna(JTable jTable1) {
        int colummSelected = jTable1.getSelectedColumn();
        if (colummSelected >= 0) {
            jTable1.getColumnModel().removeColumn(jTable1.getColumnModel().getColumn(colummSelected));
            System.out.println("Columna Eliminada,Restantes: " + jTable1.getColumnCount());
        }
    }

    /*Realiza la discretizacion de la columna de acuerdo al limite predeterminado*/
    void discretizarColumna(JTable jTable1, float limite) {
        new Operaciones().ejecutarHilo(new Runnable() {
            @Override
            public void run() {
                int selectedColumn = jTable1.getSelectedColumn();
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    float dato = Float.parseFloat(jTable1.getValueAt(i, selectedColumn).toString());
                    String res = dato >= limite ? "1" : "0";
                    jTable1.setValueAt(res, i, selectedColumn);
                }
            }
        });

    }

    /*Permite Guardar el Archivo CSV*/
    void guardarArchivo(JTable jTable1, Component cs) {
        System.out.println("Guardar CSV");
        String[] ruta = Operaciones.abrirGuardar("Archivo CSV", "csv", cs);
        List<String> lineas = new ArrayList();
        if (ruta[0].equals("s")) {
            File archivoSalida = new File(ruta[1]);
            Archivos ar = new Archivos();
            String linea = "";
            String coma = ",";
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                coma = (i == (jTable1.getColumnCount() - 1)) ? "" : ",";
                linea += jTable1.getColumnName(i) + coma;
            }
            lineas.add(linea);
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                linea = "";
                for (int j = 0; j < jTable1.getColumnCount(); j++) {
                    coma = (j == (jTable1.getColumnCount() - 1)) ? "" : ",";
                    Object column = jTable1.getValueAt(i, j);
                    String columna = (column == null) ? "NULL" : column.toString();
                    linea += columna + coma;
                }
                lineas.add(linea);
            }
            ar.guardar(lineas, archivoSalida);
        }

    }

}
