package samuelflores_examen1;

import java.util.Date;

public class Ejecutable extends Archivos{
    private String texto;

    public Ejecutable() {
        super();
    }

    public Ejecutable(String texto, String nombre, String tamano, Date fechacreacion, Date fechamodificacion) {
        super(nombre, tamano, fechacreacion, fechamodificacion);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Ejecutable{" + "texto=" + texto + '}';
    }
    
}
