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
    private ArrayList<Archivos> archivos = new ArrayList();
    private ArrayList<Archivo> archivo= new ArrayList();
    private String carpeta;

    public Carpeta() {
        super();
    }

    public Carpeta(String carpeta) {
        this.carpeta = carpeta;
    }
    

    public Carpeta(String carpeta, String nombre, Date fechacreacion, Date fechamodificacion, int capacidad, String usuario) {
        super(nombre, fechacreacion, fechamodificacion, capacidad, usuario);
        this.carpeta = carpeta;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
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
        return "Carpeta{" + "archivos=" + archivos + ", archivo=" + archivo + ", carpeta=" + carpeta + '}';
    }
    
    

    
}
