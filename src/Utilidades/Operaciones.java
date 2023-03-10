package Utilidades;

import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.JFileChooser;
import java.io.File;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Operaciones {

    static DecimalFormat formato = new DecimalFormat("###,###");
    protected static String osname;
    JFileFilter filtro = new JFileFilter();
    private JProgressBar progressbar = null;
    private static final JFileChooser fileChooser = new JFileChooser();
    private static String barra;
    private static boolean oneTime = true;

    public Operaciones() {
        this.progressbar = progressbar;
        osname = System.getProperty("os.name");
        barra = (osname.toLowerCase().contains("windows")) ? "\\" : "/";
    }

    public void abrirDialogo(JDialog dialogo, Component accesible) {
        dialogo.setLocationRelativeTo(accesible);
        dialogo.pack();
        dialogo.setVisible(true);
    }

    public void cerrarDialogo(JDialog dialogo) {
        dialogo.setVisible(false);
    }

    public void colocarEspera(JFrame frame, JProgressBar progressBar) {
        frame.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        progressBar.setIndeterminate(true);
    }

    public void quitarEspera(JFrame frame, JProgressBar progressBar) {
        frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        progressBar.setIndeterminate(false);
    }

    public void ejecutarHilo(Runnable run) {
        Thread hilo = new Thread(run);
        hilo.setPriority(Thread.MAX_PRIORITY);
        hilo.start();
    }

    public void colocarValorProgressBar(int i, JProgressBar progressBar) {
        progressBar.setIndeterminate(false);
        progressBar.setValue(i);
    }

    /*Explorador de archivos para abrir*/
    public static String[] abrirSelector(String descripcion, String extension, Component objeto) {
        String archivo[] = {"Error", "null"};

        // fileChooser.setAccessory(new ImagePreview(fileChooser));        
        if (oneTime) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter(descripcion, extension);
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileFilter(filter);
            oneTime = false;
        }
        int status = fileChooser.showOpenDialog(objeto);
        if (status == JFileChooser.APPROVE_OPTION) {
            File archsel = fileChooser.getSelectedFile();
            archivo[0] = "s";
            archivo[1] = archsel.getParent() + barra + archsel.getName();
        } else if (status == JFileChooser.CANCEL_OPTION) {
            archivo[0] = "n";
            System.out.println("canceled");

        }
        return archivo;
    }

    /*Explorador de archivos para guardar*/
    public static String[] abrirGuardar(String descripcion, String extension, Component objeto) {
        String archivo[] = {"Error", "null"};
        if (oneTime) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter(descripcion, extension);
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileFilter(filter);
            oneTime = false;
        }
        int status = fileChooser.showSaveDialog(objeto);
        if (status == JFileChooser.APPROVE_OPTION) {
            File archsel = fileChooser.getSelectedFile();
            archivo[0] = "s";
            archivo[1] = archsel.getParent() + barra + archsel.getName();
        } else if (status == JFileChooser.CANCEL_OPTION) {
            archivo[0] = "n";
            System.out.println("canceled");

        }
        return archivo;
    }

    public static Object format(Object cifra) {
        return formato.format(cifra);
    }
}

/*Clase del Selector de Archivos*/
class JFileFilter extends javax.swing.filechooser.FileFilter {

    protected String description;
    protected ArrayList exts = new ArrayList();

    @SuppressWarnings("unchecked")
    public void addType(String s) {
        exts.add(s);
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;

        } else if (f.isFile()) {
            Iterator it = exts.iterator();
            while (it.hasNext()) {
                if (f.getName().endsWith((String) it.next())) {
                    return true;
                }
            }
        }

        return false;
    }

    public void setDescription(String s) {
        description = s;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
