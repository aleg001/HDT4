/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* StackVector.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/


import java.util.Vector;

/**
 * @author Alejandro Gomez
 * @author Moise
 *
 */
public class StackVector<E> extends Stack<E> {
    private Vector<E> xd;


    public StackVector() {
        xd = new Vector<E>();
    }


    @Override
    public boolean push(E item) {
        xd.add(item);
        return true;     
    }



    @Override
    public E peek() {
        return(xd.get(xd.size() - 1));
    }


    @Override
    public boolean isEmpty() {
        return xd.isEmpty();
    }


    @Override
    public int count() {
        return xd.size();
    }



    @Override
    public E pop() {
        E obj = null;
        if (xd.isEmpty()==false){obj=(xd.remove(xd.size() - 1));}
        return obj;
    }
}