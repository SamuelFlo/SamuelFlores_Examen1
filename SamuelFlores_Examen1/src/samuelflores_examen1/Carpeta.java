/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Carpeta extends Archivos {
    ArrayList<Archivos> archivos = new ArrayList();
    ArrayList<Archivo> archivo= new ArrayList();

    public Carpeta() {
        super();
    }

    public Carpeta(String nombre, Date fechacreacion, Date fechamodificacion, int capacidad, String usuario) {
        super(nombre, fechacreacion, fechamodificacion, capacidad, usuario);
    }

    public ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivo> archivo) {
        this.archivo = archivo;
    }

    
    


    public ArrayList<Archivos> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivos> archivos) {
        this.archivos = archivos;
    }
    


    @Override
    public String toString() {
        return "Carpeta{" + "archivos=" + archivos + '}';
    }
    
}
