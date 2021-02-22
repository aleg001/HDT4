/***************************************************************
* Vista.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
* Fecha creacion: 18/02/21
* Ultima modificacion: 21/02/21
***************************************************************/

/**
 * Metodos de Vista
 * @author Alejandro Gomez
 * */


public class Vista {

    /**
     * Metodo de Bienvenida
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void Welcome(){
        System.out.println("\nBienvenido a la calculadora Infix-Postfix");
        System.out.println("1. Usar calculadora");
        System.out.println("2. Salir\n");
        System.out.println("Ingrese su opcion:  ");
    }

    /**
     * Opciones
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void Options(){
        System.out.println("\nCual implementacion de Stack usara?");
        System.out.println("1. Vector");
        System.out.println("2. ArrayList");
        System.out.println("3. List\n");
        System.out.println("Ingrese su opcion:  ");
    }


    /**
     * Error
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public void Error(){
        System.out.println("ERROR: ");
        System.out.println("Ingreso erroneo, intente de nuevo.");
    }

    /**
     * FileInput
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void FileInput(){
        System.out.println("Ingrese el nombre del archivo que desea leer");
        System.out.println("Tip: No escriba la extension .txt");
    }

    /**
     * FileOption
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public void FileOption(){
        System.out.println("Que desea hacer?");
        System.out.println("1. Abrir otro archivo");
        System.out.println("2. Salir\n");
        System.out.println("Ingrese su opcion:  ");
    }
}
