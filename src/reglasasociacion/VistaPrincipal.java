package reglasasociacion;

import Utilidades.Operaciones;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        umbralSoporte = new javax.swing.JSpinner();
        botonbuscar = new javax.swing.JButton();
        rutaArchivo = new javax.swing.JTextField();
        transacciones = new javax.swing.JTextField();
        nCampos = new javax.swing.JTextField();
        botonProcesar = new javax.swing.JButton();
        ocurrencia = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        barraProgreso = new javax.swing.JProgressBar();
        botonSalir = new javax.swing.JButton();

        jPopupMenu1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jPopupMenu1PopupMenuWillBecomeVisible(evt);
            }
        });

        jMenuItem1.setText("Discretizar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jDialog1.setTitle("Discretizar Columna");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Discretizar Columna"));

        jLabel1.setText("Limite:");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.1f));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("#################");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuItem9.setText("Guardar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jPopupMenu3.add(jMenuItem9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reglas de Asociación");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        umbralSoporte.setModel(new javax.swing.SpinnerNumberModel(50, 0, 100, 1));
        umbralSoporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Umbral Soporte"));
        umbralSoporte.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                umbralSoportePropertyChange(evt);
            }
        });

        botonbuscar.setText("Explorar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        rutaArchivo.setEditable(false);
        rutaArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruta Archivo"));

        transacciones.setEditable(false);
        transacciones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        transacciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Transacciones"));

        nCampos.setEditable(false);
        nCampos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));

        botonProcesar.setText("Procesar");
        botonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesarActionPerformed(evt);
            }
        });

        ocurrencia.setEditable(false);
        ocurrencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ocurrencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Minima Ocurrencia"));

        jScrollPane1.setComponentPopupMenu(jPopupMenu1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Entrada", jScrollPane1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setComponentPopupMenu(jPopupMenu3);
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("Salida", jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rutaArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonProcesar)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(umbralSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ocurrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(269, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umbralSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocurrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar)
                    .addComponent(botonProcesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        buscarArchivo();
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesarActionPerformed
        procesar();
    }//GEN-LAST:event_botonProcesarActionPerformed

    private void umbralSoportePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_umbralSoportePropertyChange
        actualizarOcurrencia();
    }//GEN-LAST:event_umbralSoportePropertyChange

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        borrarColumna();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jPopupMenu1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jPopupMenu1PopupMenuWillBecomeVisible
        configurarMenu();
    }//GEN-LAST:event_jPopupMenu1PopupMenuWillBecomeVisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        discretizarColumna();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        abrirDialogoDiscretizarColumna();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        guardarEntrada();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Operaciones().cerrarDialogo(jDialog1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        guardarSalida();
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    /* Metodo Main del JFrame*/
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    VistaPrincipal frame = new VistaPrincipal();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton botonProcesar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField nCampos;
    private javax.swing.JTextField ocurrencia;
    private javax.swing.JTextField rutaArchivo;
    private javax.swing.JTextField transacciones;
    private javax.swing.JSpinner umbralSoporte;
    // End of variables declaration//GEN-END:variables
/* Permite mostrar al usuario el limite minimo del calculod de las transacciones actuales*/
    private void actualizarOcurrencia() {
        MainController controller = new MainController();
        int registros = jTable1.getRowCount();
        int umbral = Integer.parseInt(umbralSoporte.getValue().toString());
        ocurrencia.setText("" + Operaciones.format(controller.getCountRes(umbral, registros)));
    }

    /*Permite eliminar una columna de Jtable de datos de entrada*/
    private void borrarColumna() {
        int colummSelected = jTable1.getSelectedColumn();
        if (colummSelected >= 0) {
            jTable1.getColumnModel().removeColumn(jTable1.getColumnModel().getColumn(colummSelected));
            System.out.println("Columna Eliminada");
           nCampos.setText(""+Operaciones.format(jTable1.getColumnCount()));
        }

    }

    /*Permite obtener un modelo de datos bidimensional de los campos frecuentes en base del umbral de soporte*/
    private void procesar() {
        System.out.println("Procesando");
        JFrame frame = this;
        Thread hilo = new Thread(() -> {
            new Operaciones().colocarEspera(frame, barraProgreso);//Colocamos Espera
            MainController controller = new MainController();//Invocamos al controller
            int porcentajeUmbral = Integer.parseInt(umbralSoporte.getValue().toString());//Capturamos el umbral de soporte
            DefaultTableModel modeloResultado = controller.procesarDatos(porcentajeUmbral, barraProgreso, jTable1);//
            jTable3.setModel(modeloResultado);
            new Operaciones().quitarEspera(frame, barraProgreso);//Quitar Espera
        });
        hilo.setPriority(Thread.MAX_PRIORITY);
        hilo.start();
    }

    /*Metodo Permite Discretizar una columna en 1 o 0 dependiendo del rebase de limite establecido*/
    private void discretizarColumna() {
        MainController cm = new MainController();
        float limite = Float.parseFloat(jSpinner2.getValue().toString());
        cm.discretizarColumna(jTable1, limite);
        new Operaciones().cerrarDialogo(jDialog1);
    }

    /*Guardar archivo etrada CSV*/
    private void guardarEntrada() {
        new MainController().guardarArchivo(jTable1, this);
    }

    /*Guardar archivo de salida en CSV*/
    private void guardarSalida() {
        new MainController().guardarArchivo(jTable3, this);
    }

    /*Abrir dialogo discretizador dependiendo si el campo es numerico de lo contrario no se ejecuta ninguna accion*/
    private void abrirDialogoDiscretizarColumna() {
        Object valor = jTable1.getValueAt(0, jTable1.getSelectedColumn());
        try {
            Float.parseFloat(valor.toString());
            jLabel2.setText(jTable1.getColumnName(jTable1.getSelectedColumn()));
            new Operaciones().abrirDialogo(jDialog1, this);
        } catch (NumberFormatException e) {
            System.out.println("Error campo atributo");
        }
    }

    /*Permite explorar los archivos del usuario para la carga del CSV de entrada y coloca la informacion en la vista*/
    private void buscarArchivo() {
        JFrame frame = this;
        Thread hilo = new Thread(() -> {
            String[] ruta = Operaciones.abrirSelector("Archivo CSV", "csv", frame);
            new Operaciones().colocarEspera(frame, barraProgreso);
            if ("s".equals(ruta[0])) {
                MainController controller = new MainController();
                String RUTA = ruta[1];
                DefaultTableModel modelo = controller.extraerDatos(RUTA);
                rutaArchivo.setText(RUTA);
                int campos = modelo.getColumnCount();
                int registros = modelo.getRowCount();
                int umbral = Integer.parseInt(umbralSoporte.getValue().toString());
                transacciones.setText("" + Operaciones.format(registros));
                nCampos.setText("" + Operaciones.format(campos));
                ocurrencia.setText("" + Operaciones.format(controller.getCountRes(umbral, registros)));
                jTable1.setModel(modelo);
            }
            new Operaciones().quitarEspera(frame, barraProgreso);
        });
        hilo.setPriority(Thread.MAX_PRIORITY);
        hilo.start();

    }

    /*Permite configurar el menu dependiendo si el usuario selecciono una columna valida*/
    private void configurarMenu() {
        int colummSelected = jTable1.getSelectedColumn();
        if (colummSelected < 0) {
            jMenuItem1.setEnabled(false);
            jMenuItem2.setEnabled(false);
        } else {
            jMenuItem1.setEnabled(true);
            jMenuItem2.setEnabled(true);
        }
    }

}
