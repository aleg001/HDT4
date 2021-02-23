/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Ale Gomez
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/



public class Driver {
    public static void main(String[] args){ 
        //Se declaran instancias y variables
        Vista v = new Vista();
        boolean salir = false;
        int opcion = 0; int opcionsubmenu = 0;

        v.Welcome();
         
        while (salir == false){
            opcion = v.MenuOp();
            v.FileName();
            String file = v.Archivo();
            v.LectorArchivo(file);
            
            if(opcion == 1){
                opcionsubmenu = v.Options();
                if(opcionsubmenu == 1){
                    //Opcion Vector
                    System.out.println("xdxdxd");
                }
                if(opcionsubmenu == 2){
                    //Opcion ArrayList
                    //aki ay dos subopsiones
                    System.out.println("xdxdxd");
                }
                if(opcionsubmenu == 3){
                    //Opcion List
                    System.out.println("xdxdxd");
                }
                if(opcionsubmenu == 4){
                    //Salir
                    salir = true;
                }
            }
            if (opcion ==2){
                v.MensajeSalida();
                salir = true;
            }

        }
    }
}