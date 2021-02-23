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
        ImplementacionCalcu Calculadora3000 = ImplementacionCalcu.getC();
        Vista v = new Vista();
        boolean salir = false; boolean verificar = false;
        int opcion = 0; int opcionsubmenu = 0; 

        v.Welcome();
         
        while (salir == false){
            opcion = v.MenuOp();
            v.FileName();
            String archivo = v.Archivo();
            v.LectorArchivo(archivo);
            //Lector de archivo

            if(opcion == 1){
                opcionsubmenu = v.Options();
                //El usuario ingresa que tipo de stack quiere usar

                if(opcionsubmenu == 1){
                    //Opcion Vector
                    verificar = Calculadora3000.setImplementationType(1);
                    System.out.print(Calculadora3000.decode(archivo));
                    

                } else if (opcionsubmenu == 2){
                    //Opcion ArrayList
                    verificar = Calculadora3000.setImplementationType(3);
                    System.out.print(Calculadora3000.decode(archivo));
                }
                else if(opcionsubmenu == 3){
                    //Opcion List
                    verificar = Calculadora3000.setImplementationType(2);
                    System.out.print(Calculadora3000.decode(archivo));

                }else if(opcionsubmenu == 4){
                    v.MensajeSalida();
                    salir = true;
                }
            }
            else if (opcion ==2){
                v.MensajeSalida();
                salir = true;
            }

        }
    }
}