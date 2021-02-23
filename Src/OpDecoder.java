/***************************************************************
* OpDecoder.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 18/02/21
* Ultima modificacion: 21/02/21
***************************************************************/


/**
 * Infix to Postfix operations
 * @author Alejandro Gomez
 * 
 * */


public class OpDecoder {
    
    /**
     * Provides math operations based on their hierarchy order.
     * @param String info
     * @return inverseDataFromStack
     * @author Alejandro Gomez
     * */

    public StackList<String> Translator(IStack<String> info){

        //The instances used on this method are defined.
        StackList<String> StackR = new StackList<>();StackList<String> Stacker = new StackList<>();

        //While the stack received is empty, the info goes through the while loop.
        while(!info.isEmpty()){
            //Creates a String with the information in the given stack
            String DataFromStack = info.pop();

            //If it has more values than 0, it goes to the while loop.
            if(OpHierarchy(DataFromStack)>0){while(!Stacker.isEmpty() && OpHierarchy(Stacker.peek())>=OpHierarchy(DataFromStack)){StackR.push(Stacker.pop());
            }Stacker.push(DataFromStack);}

            //If it has ) or (, it goes through these conditions.
            else if(DataFromStack.equals(")") ){String StackValue = Stacker.pop();
                while(!StackValue.equals("(")){StackR.push(StackValue); StackValue = Stacker.pop();}}
                else if(DataFromStack.equals("(")){Stacker.push(DataFromStack);}
                else{StackR.push(DataFromStack);}
            }
            //Creates a for loop for each value in stack, giving a stack with all the info reversed.
            for(int i=0;i<Stacker.count();i++){StackR.push(Stacker.pop());}
            StackList<String> inverseDataFromStack = new StackList<>();
            while(!StackR.isEmpty()){inverseDataFromStack.push(StackR.pop());}

            //The method returns the data from the Stack.
            return inverseDataFromStack;
        }

    /**
     * Gives each operation a value in the hierarchy.
     * @param String Hierarchy
     * @return int
     * @author Alejandro Gomez
     * */

    private int OpHierarchy(String Hierarchy){
        //Creates a switchcase to give each operation it's value in the hierarchy.
        switch (Hierarchy){
            case "+":
                return 1;
            case "-":
                return 1; 
            case "*": 
                return 2;
            case "/":
                return 2; 
        }
        return -1; 
    }




}
