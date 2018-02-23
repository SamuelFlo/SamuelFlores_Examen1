/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_examen1;

import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Archivos {
    private String nombre;
    private int capacidad;
    private Date fechacreacion= new Date();
    private Date fechamodificacion= new Date();
    private String usuario;
    private String raiz="root";
    private Carpeta car;

    public Archivos() {
    }

    public Archivos(String nombre, int capacidad, String usuario) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.usuario = usuario;
    }
    

    public Archivos(String nombre, Date fechacreacion, Date fechamodificacion, int capacidad, String usuario) {
        this.nombre = nombre;
        this.fechacreacion = fechacreacion;
        this.fechamodificacion = fechamodificacion;
        this.capacidad = capacidad;
        this.usuario = usuario;
    }


    public String getRaiz() {
        return raiz;
    }

    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }
    


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    @Override
    public String toString() {
        return "Archivos{" + "nombre=" + nombre + ", fechacreacion=" + fechacreacion + ", fechamodificacion=" + fechamodificacion + ", capacidad=" + capacidad + ", usuario=" + usuario + ", raiz=" + raiz + '}';
    }
    

    
    
}
