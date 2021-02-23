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

    //Se crean instancias a utilizar
    private static ImplementacionCalcu Calculadora = new ImplementacionCalcu(); 
    private FactoryStack sanFrancisco = new FactoryStack(); private String ImplementacionUsada = "";
    
    //USO DE SINGELNTON
    private ImplementacionCalcu(){};
    public static ImplementacionCalcu getC(){return Calculadora;}

    @Override
    /**
     * Devuelve la suma de dos números
     * @param x valor que se suma 
     * @param y valor que se suma
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
    



   
    /** 
    *  Metodo operar
    * Brinda al usuario el resultado de las operaciones
    * @param Info recibe los datos
    * @return Devuelve los resultados
    * @author Alejandro Gomez
    */
    @Override
    public int operar(IStack info) {
        
        //En caso el stack ingresado es 0, devuelve 0 porque no hay operaciones
        if(info.count() == 0){return 0;}
        
        //Se define la instancia de stack a utilizar
        Stack<String> Operation =  sanFrancisco.getStackType(ImplementacionUsada); Stack<String> line = new StackVector<String>();
        System.out.println("Operaciones a realizar: ");
        
    

        String[] infoArray = info.pop().toString().split("");
        for (int i = (infoArray.length - 1); i > -1;i--){
            line.push(infoArray[i]);
        }

        while(!line.isEmpty()) {
            String LastStackBit = (String) line.pop();
            //.toString(); 
            int a; int b; int resultado;
        
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
                a = Integer.parseInt(Operation.pop());b = Integer.parseInt(Operation.pop());
                resultado = a*b;
                System.out.println("Usted ingreso: "); 
                System.out.println("Numero 1: "+a); 
                System.out.println("*");
                System.out.println("Numero 2: "+b);
                System.out.println("Resultado: "+ resultado);
                Operation.push(Integer.toString(resultado));
                break;
            
            case "+":
                a = Integer.parseInt(Operation.pop());b = Integer.parseInt(Operation.pop());
                resultado = a+b;
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
        //Operation.push("1"); Si esta funcionando las operaciones, si brindo un resultado
        //System.out.println(Operation.pop()); No esta almacenando datos por eso da null, revisar operation push
        
        //Operation.push("1");
        //Operation.push("+");
        //Operation.push("2");
        //Operation.push("*");
        //Operation.push("9");

        
        
        //Revisar interfaces, stacks, como se crean stacks, traductor de operaciones.
        //Prints para cada metodo de las stacks
        //Hacer debugging con cada una
    

        //LINEA QUE MARCA ERROR
        int resultadoEnInt = Integer.parseInt(Operation.pop());
        
        //System.out.println(resultadoEnInt);

        return resultadoEnInt;
        
    }


    @Override
    /** Metodo para realizar el proceso de decodificar
     * @param string a
     * @return string
     * @author Alejandro Gomez 
     */

    public String decode(String a){
        
        //Se crean instancias a utilizar 
        OpDecoder od = new OpDecoder(); Scanner archivoS = new Scanner(System.in);
        //Se crea trycatch para la creacion del archivo
        try {archivoS = new Scanner(new File(a + ".txt"));} 
        catch(FileNotFoundException e) {return("ERROR: Archivo no se encontro");}   
        
        archivoS.useDelimiter("\n");
        
        Stack<String> linesInFile = sanFrancisco.getStackType(ImplementacionUsada); 
        Stack<String> inverseLines = sanFrancisco.getStackType(ImplementacionUsada); 
        String resultado = ""; int opMade = 0;



        //Se crea while para que por cada linea las agregue al stack
        while(archivoS.hasNext()){String nextBit = archivoS.next(); linesInFile.push(nextBit);}

        //Se crea un ciclo while para hacer un stack con los datos en inversa
        while(!linesInFile.isEmpty()){inverseLines.push(linesInFile.pop());}

        //Se crea ciclo while para verificar en las lineas inversas el conteo
        while(inverseLines.count()>0){
            String linesInFileData = inverseLines.pop(); 
            Stack<String> info = sanFrancisco.getStackType(ImplementacionUsada);
            Scanner lineReader = new Scanner(linesInFileData);

            
            while(lineReader.hasNext()){
                String characterInLine = lineReader.next(); info.push(characterInLine);}
                Stack<String> inverseDataLines = sanFrancisco.getStackType(ImplementacionUsada);
                while(!info.isEmpty()){
                    inverseDataLines.push(info.pop());}

            Stack<String> linesInPostFix = od.Translator(inverseDataLines);

            //Se crea un integer con los resultados de la calculadora
            
            //LINEA QUE MARCA ERROR
            int operationalResult = operar(linesInPostFix);
            
            //Se devuelve un resultado ya ordenado
            opMade++; resultado = resultado+"El resultado de las operaciones: "+opMade+" es "+Integer.toString(operationalResult)+"\n\n\n";lineReader.close();archivoS.close();
        } 
        return "el resultado es: "+resultado;
    
    }

    /** Metodo para brindar la implementacion a utilizar
     * @param Int imptype
     * @return boolean
     * @author Alejandro Gomez 
     */

    @Override
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

}
    
        
    


