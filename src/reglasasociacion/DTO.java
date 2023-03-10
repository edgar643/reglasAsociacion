package reglasasociacion;

import Utilidades.Operaciones;
import java.io.Serializable;

public class DTO implements Serializable {

    String nombre;
    long cantidad;

    public DTO(String nombre, long cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        String output = "(" + getNombre() + " : " + Operaciones.format(getCantidad()) + ")";
        return output;
    }

}
