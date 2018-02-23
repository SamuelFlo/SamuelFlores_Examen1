package samuelflores_examen1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SamuelFlores_Examen1 {
    static ArrayList<Archivos> archi = new ArrayList();
    static Carpeta car = new Carpeta();
    static Scanner lectura = new Scanner(System.in);
    static Date dat = new Date();
    static Date dat2 = new Date();
    
    public static void main(String[] args) {
        char r='s';
        int cont=0;
        System.out.println("Ingrese el nombre: ");
        String nombre= lectura.nextLine();
        System.out.println("Ingrese el usuario: ");
        String usuario = lectura.nextLine();
        System.out.println("Ingrese la capacidad: ");
        int capacidad = lectura.nextInt();
        /*archi.setNombre(nombre);
        archi.setUsuario(usuario);
        archi.setCapacidad(capacidad);*/
        
        archi.add(new Archivos());
        archi.get(cont).setNombre(nombre);
        archi.get(cont).setUsuario(usuario);
        archi.get(cont).setCapacidad(capacidad);
        /*car.getArchivos().add(new Archivos());
        car.getArchivos().get(cont).setNombre(nombre);
        car.getArchivos().get(cont).setCapacidad(capacidad);
        car.getArchivos().get(cont).setUsuario(usuario);*/
        
        while(r=='s'){
            System.out.println("Ingrese el comando: ");
            System.out.println(archi.get(cont).getUsuario()+"/"+archi.get(cont).getRaiz()+"/");
            System.out.print(archi.get(cont).getUsuario()+"/"+archi.get(cont).getRaiz()+"/");
            String comando = lectura.nextLine();
            comando = lectura.nextLine();
            if(comando.equals("mkdir")){
                System.out.println("Ingrese el nombre de la carpeta: ");
                String nombrecar=lectura.nextLine();
                System.out.println("Ingrese el size: ");
                int size = lectura.nextInt();
                archi.add(new Carpeta(nombrecar));
                archi.get(cont).getFechacreacion().getDate();
                archi.get(cont).getFechamodificacion().getDate();
                System.out.println("");
                
            }else if(comando.equals("cat")){
                System.out.println("hola");
                String arch=lectura.nextLine();
                String txt=lectura.nextLine();
                if(txt.equals(".txt")){
                    System.out.println("ENTRO 1");
                    System.out.println("Ingrese el texto: ");
                    String texto= lectura.nextLine();
                    archi.add(new Archivo(texto));
                }else if(txt.equals(".exec")){
                    System.out.println("ENTRO 2");
                }
                
                
            }else if(comando.equals("mod")){
                
            }else if(comando.equals("cd")){
                
            }else if(comando.equals("cd..")){
                
            }else if(comando.equals("Ls")){
                for (Archivos temp: archi) {
                    if(temp instanceof Archivos){
                        System.out.println(temp);
                    }
                }
                
            }else if(comando.equals("del")){
                System.out.println("Ingrese el nombre de archivo a eliminar: ");
                String archivo=lectura.nextLine();
                for (int i = 0; i < car.getArchivo().size(); i++) {
                    System.out.println("ew");
                    if(archivo.equals(car.getArchivos().get(i).getNombre())){
                        System.out.println("yei");
                        car.getArchivos().remove(i);
                    }
                    
                }
                
                
                
            }else if(comando.equals("exec")){
                
            }
            System.out.println("Desea continuar: ");
            r=lectura.next().charAt(0);
        }
            
        
            
        
        
    }
    
}
