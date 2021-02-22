/**
 * @author Alejandra Guzman
 */


public class Vector<E> implements IStack<E> 
 {
    protected Vector<E> data;
    /**
     * constructs a new, empty Stack
     */

     public vector()
     {
         data = new Vector<E>();
     }


 }
{
   protected Vector<E> data;
   /**
    * constructs a new, empty Stack
    */

    public Vector()
    {
        data = new Vector<E>();
    }
    /**
     * @param element
     */

    public boolean push(E element)
    /**
     * the value is added to the stack
     * will be popped next if no intervening push
     */
    {
        data.add(element);

    }

    /** 
     * @return last element of the stack
     * */ 

     public E pop() {
         /**
          * Stack is not empty 
          post: most recently pushed item is removed and returned
          */
         return data.remove(count()-1);

     }

     /**
      * @return shows last element in the stack
      */

      public E peek(){
          return data.get(count()-1);


      }

      /**
       * @return the number of elements in the stack
       */

       public boolean isEmpty(){
           return count() == 0;
       }
	@Override
	public boolean push(E item) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}



    
}