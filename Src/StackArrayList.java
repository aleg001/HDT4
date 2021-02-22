import java.util.ArrayList;

/**
 * @author Alejandra Guzman Dominguez 
 * @author Alejandro Gomez
 * @param <E> type of object
 */

 public class StackArrayList<E> extends Stack<E>
    {
     protected ArrayList<E> data;
     /**
      * Constructs a new, empty Stack
      */

      public StackArrayList()
      {
          data = new ArrayList<E>();

      }
      /**
       * @param item of the value to be added
       */

       public boolean push(E element){
           return data.add(element);
       }

       /**
        * @return last element of the stack
        */

        public E pop(){
            return data.remove(size()-1);


        }

        /**@return shows the last element of the stack */

        public E peek(){
            return data.get(size()-1);
        }

        /**
         * @return the number of elements in the stack
         */

         public int size(){
             return data.size();
         }

         public boolean isEmpty(){
             return size() == 0;
         }

         @Override
         public int count() {
             return data.size();
         }
    }