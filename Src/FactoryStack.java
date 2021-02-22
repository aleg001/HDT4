/***************************************************************
* FactoryStack.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 21/02/21
* Ultima modificacion: 22/02/21
***************************************************************/

 public class FactoryStack{

/**
 * FactoryStack
 * @author Alejandro Gomez
 * @param String Stacktype: el tipo de Stack.
 * @return Stack
 */

    public Stack getStackType(String StackType){
        /*
        * Metodo getStackType
        * Creado para obtener el tipo de Stack y crearlo
        * En base a String ingresado
        */
        
        //Se crea un switchcase para saber el tipo de Stack que se quiere utilizar
        switch (StackType){
            case "Vector":
            //En caso elija la opcion de Vector, se crea un nuevo StackVector
                return new StackVector<>();
            case "ArrayList":
            //En caso se elija la opcion de ArrayList, se crea un nuevo Stack de tipo ArrayList
                return new StackArrayList<>();
            case "List":
            //En caso se elija la opcion de List, se crea un stack de tipo List.
                return new StackList<>();
            default:
                return new StackArrayList<>();
            }
            
                
            
        }   
    
}
    

   