/***************************************************************
* Calculadora.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 29/01/21
* Ultima modificacion: 6/02/21
***************************************************************/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ImplementacionCalcu implements InterfazCalculadora{

    private static ImplementacionCalcu Calculadora = new ImplementacionCalcu(); 
    private FactoryStack sanFrancisco = new FactoryStack();
    private String ImplementacionUsada = "";
    
    @Override
    /**
     * Devuelve la suma de dos números
     * @param x valor 1 que se suma 
     * @param y valor 2 que se suma
     * @return Resultado de suma x+y
     * @author Alejandro Gomez
     */
    public int suma(int x, int y) {
        int retorno = x+y;
        return retorno;
    }

    @Override
       /**
     * Brinda la resta de dos números
     * @param x El valor al que sera restado otro
     * @param y El valor a restar
     * @return El resultado de x-y
     * @author Alejandro Gomez
     */
    public int resta(int x, int y) {
        int retorno = x-y;
        return retorno;
    }

    
    @Override
        /**
     * Método para multiplicar
     * 
     * @param int x
     * @param int y
     * @return int
     * @author Alejandro Gomez
     **/
    public int multiplicacion(int x, int y) {
        int retorno = x*y;
        return retorno;
        

    }
    
    @Override
    /**
     * Método para dividr
     * 
     * @param int x,y
     * @return int
     * @author Alejandro Gomez
     **/
    public int division(int x, int y) {
        int retorno = x/y;
        return retorno;
    }
    /** */
    



    @Override
    /** 
    *  Metodo operar
    * Brinda al usuario el resultado de las operaciones
    * @param Info recibe los datos
    * @return Devuelve los resultados
    * @author Alejandro Gomez
    */
    public int operar(Stack info) {
        
        //En caso el stack ingresado es 0, devuelve 0 porque no hay operaciones
        if(info.count() == 0){return 0;}
        
        //Se define la instancia de stack a utilizar
        Stack<String> Operation =  sanFrancisco.getStackType(ImplementacionUsada);
        while(!info.isEmpty()){String LastStackBit = info.pop().toString(); int a; int b; int resultado;
        
        switch (LastStackBit){
            
            /**
            *  Para cada caso numerico
            *   se agrega al stack
            *   el valor ingresado
            */
            case "0":
                Operation.push(LastStackBit);
                System.out.println("Felicidades");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "1":
                Operation.push(LastStackBit);
                System.out.println("Felicidades");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "2":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "3":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "4":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "5":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "6":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "7":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "8":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
            case "9":
                Operation.push(LastStackBit);
                System.out.println("Felicidades!");
                System.out.println("Agrego correctamente :"+LastStackBit+" al stack.");
                break;
                
            /**
            *  Para cada caso de signo
            *   se agrega al stack
            *   el valor ingresado
            **/
            case "*":
                a = Integer.parseInt(Operation.pop());
                b = Integer.parseInt(Operation.pop());
                resultado = a*b;
                System.out.println("Usted ingreso: ");
                System.out.println("Numero 1: "+a);
                System.out.println("*");
                System.out.println("Numero 2: "+b);
                System.out.println("Resultado: "+ resultado);
                Operation.push(Integer.toString(resultado));
                break;
            
            case "+":
                a = Integer.parseInt(Operation.pop());b = Integer.parseInt(Operation.pop());resultado = a+b;
                System.out.println("Usted ingreso: ");
                System.out.println("Numero 1: "+a);
                System.out.println("+");
                System.out.println("Numero 2: "+b);
                System.out.println("Resultado: "+ resultado);
                Operation.push(Integer.toString(resultado));
                break;

            case "-":
                a = Integer.parseInt(Operation.pop());b = Integer.parseInt(Operation.pop());resultado = a-b;
                System.out.println("Usted ingreso: ");
                System.out.println("Numero 1: "+a);
                System.out.println("-");
                System.out.println("Numero 2: "+b);
                System.out.println("Resultado: "+ resultado);
                Operation.push(Integer.toString(resultado));
                break;
        
            case "/":
                a = Integer.parseInt(Operation.pop());b = Integer.parseInt(Operation.pop());resultado = a/b;
                System.out.println("Usted ingreso: ");
                System.out.println("Numero 1: "+a);
                System.out.println("/");
                System.out.println("Numero 2: "+b);
                System.out.println("Resultado: "+ resultado);
                Operation.push(Integer.toString(resultado));
                break;
        }

    }
        //Se brinda el resultado obtenido en cada operacion
        int resultadoEnInt = Integer.parseInt(Operation.pop());
        return resultadoEnInt;
        
    }

    public boolean setImplementationType(int ImplementationType){
        switch (ImplementationType) {
            case 1:
            ImplementacionUsada = "Vector";
                return true;
            case 2:
                ImplementacionUsada = "List";
                return true;
            case 3:
                ImplementacionUsada = "ArrayList";
                return true;
        
            default:
                return false;
        }
    }
    @Override
    /** Metodo para realizar el proceso de decodificar
     * @param string a
     * @return string
     * @author Alejandro Gomez 
     */

    public String decode(String a){
        //Se crean instancias a utilizar 
        OpDecoder od = new OpDecoder(); Scanner file = new Scanner(System.in);
        Stack<String> linesInFile = sanFrancisco.getStackType(ImplementacionUsada); Stack<String> inverseLines = sanFrancisco.getStackType(ImplementacionUsada); 
        String resultado = ""; int opMade = 0;

        //Se crea trycatch para la creacion del archivo
        try {file = new Scanner(new File(file + ".txt"));} 
        catch(FileNotFoundException e) {return("Archivo no encontrado");}   
        file.useDelimiter("\n");

        //Se crea while para que por cada linea las agregue al stack
        while(file.hasNext()){String nextBit = file.next(); linesInFile.push(nextBit);}

        //Se crea un ciclo while para hacer un stack con los datos en inversa
        while(!linesInFile.isEmpty()){inverseLines.push(linesInFile.pop());}
        while(inverseLines.count()>0){
            String linesInFileData = inverseLines.pop(); Stack<String> dataFromFile = sanFrancisco.getStackType(ImplementacionUsada);Scanner lineReader = new Scanner(linesInFileData);Stack<String> inverseDataLines = sanFrancisco.getStackType(ImplementacionUsada);
            while(lineReader.hasNext()){String characterInLine = lineReader.next(); dataFromFile.push(characterInLine);}
            while(!dataFromFile.isEmpty()){inverseDataLines.push(dataFromFile.pop());}
            Stack<String> linesInPostFix = od.Translator(inverseDataLines);
            int operationalResult = operar(linesInPostFix);
            opMade++; resultado = resultado+"El resultado de las operaciones: "+opMade+" es "+Integer.toString(operationalResult)+"\n\n\n";
        } return resultado;




    
}
}
    
        
    


