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
    @Override
    /** Metodo para realizar el proceso de decodificar
     * @param string a
     * @return string 
     */

    public String decode(String a){
         
        // Instancias
        /**Se crean todas las instancias 
         * a utilizar
         */
        Scanner archivoLectura = new Scanner(System.in);
        FactoryStack<String> LineasTexto = new FactoryStacl<String>();
        FactoryStack<String> ReverseLines = new FactoryStack<String>();
        FactoryStack<String> ReversedData = new FactoryStack<String>();
        String resultadoLineas = "";
        int opsR = 0;

        //** Progra defensiva */
        
        /**Se utiliza un trycatch para asegurarse de que exista
         * un archivo, de forma correcta
         */

           try{archivoLectura = new Scanner(new File(a));}
           catch(FileNotFoundException e){
           return("No se ha encontrado un archivo" + "\n Ingresa un archivo correcto: ");

        }

        
        archivoLectura.useDelimiter("\n");

        //Ciclos 
        /** Se crea un ciclo para revisar el numero de lineas,
         * y agregarlas al stack con los procesos 
         * necesarios para efectuarlas
         */
           while(archivoLectura.hasNext()){
            String fileLines = archivoLectura.next();
            LineasTexto.push(fileLines);
        }

           while(!LineasTexto.empty()){
           ReverseLines.push(LineasTexto.pop());

        }

           while(ReverseLines.size()>0){
             String line = ReverseLines.pop();
             FactoryStack<String> Dat = new FactoryStack<String>();
             Scanner lineaS = new Scanner(line);

           while(lineaS.hasNext()){
               String datoCrack = lineaS.next();
               Dat.push(datoCrack);
           }
           while(!Dat.empty()){
               ReverseData.push(Dat.pop());

             int result = operar(ReverseData);
            opsR ++;
            resultadoLineas = resultadosLineas + "Operacion#" + opsR + Integer.toString(result) + "\n\n";
           }

           return resultadoLineas;
           

        }        
      
    
	}
}
    
        
    


