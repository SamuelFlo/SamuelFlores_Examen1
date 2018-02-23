package samuelflores_examen1;

import java.util.Date;

public class Archivo extends Archivos {
    private String texto;
    //archivo de texto

    public Archivo() {
        super();
    }

    public Archivo(String texto, String nombre, Date fechacreacion, Date fechamodificacion, int capacidad, String usuario) {
        super(nombre, fechacreacion, fechamodificacion, capacidad, usuario);
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
        return "Archivo{" + "texto=" + texto + '}';
    }

    
    
}
