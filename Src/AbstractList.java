/**
 * Clase abstracta para las istas
 * @param <E> el tipo de dato
 * @author Alejandra Guzman
 */


 public abstract class AbstractList<E> implements IList<E> {

    public AbstractList(){
        //Does nothing
    }

    /**
     * @return true if the list is empty
     */

     public boolean isEmpty(){
         return count() == 0;
         //returns number of elements in list

     }
    }