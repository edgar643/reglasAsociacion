package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {

       /*Lee un CSV*/
    public List<String> leer(File archivo) {
        List archivoL = new ArrayList();
        try {
            Scanner linea;
            String lleida = null;
            linea = new Scanner(archivo);
            while (linea.hasNext()) {
                lleida = linea.nextLine();
                archivoL.add(lleida);
            }
            linea.close();
        } catch (FileNotFoundException ex) {

            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);

        }
        return archivoL;
    }

    /*Guarda un CSV*/
    public boolean guardar(List<String> lineas, File archivo) {
        PrintWriter tarchivo = null;
        String linea = null;
        boolean listo = false;

        try {
            tarchivo = new PrintWriter(archivo);
        } catch (FileNotFoundException ex) {

            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < lineas.size(); i++) {
            linea = lineas.get(i).toString();
            tarchivo.println(linea);

        }
        tarchivo.close();

        listo = true;
        return listo;

    }

}
