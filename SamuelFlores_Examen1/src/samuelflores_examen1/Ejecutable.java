package samuelflores_examen1;

import java.util.Date;

public class Ejecutable extends Archivos{
    private String texto;
    private String sistema;

    public Ejecutable() {
        super();
    }

    public Ejecutable(String texto, String sistema, String nombre, Date fechacreacion, Date fechamodificacion, int capacidad, String usuario) {
        super(nombre, fechacreacion, fechamodificacion, capacidad, usuario);
        this.texto = texto;
        this.sistema = sistema;
    }

   
    


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "Ejecutable{" + "texto=" + texto + ", sistema=" + sistema + '}';
    }

    
    
}
