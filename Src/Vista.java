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

import java.util.Scanner;
public class Vista {
    Scanner scan;


    public Vista(){
        scan = new Scanner(System.in);
    }

    public int MenuOp(){
        int op = 2;
        String ops = "";
        boolean validar = true;
        System.out.println("\n1. Usar calculadora");
        System.out.println("2. Salir\n");
        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
        
    }
    /**
     * Metodo de Bienvenida
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void Welcome(){
        System.out.println("\nBienvenido a la calculadora Infix-Postfix");
    }

    /**
     * Opciones
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public int Options(){
        int op = 4;
        String ops = "";
        boolean validar = true;
        System.out.println("\nCual implementacion de Stack usara?");
        System.out.println("1. Vector");
        System.out.println("2. ArrayList");
        System.out.println("3. List");
        System.out.println("4. Salir\n");
        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
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


    public int validarNum (String rawNumero) {
        int numInt = -1;
        try {
            numInt = Integer.parseInt(rawNumero);
        }
        catch (NumberFormatException e)
        {
           System.out.println( "\nIngrese un numero valido porfa." );
        }
        
        return numInt;
      }

}
