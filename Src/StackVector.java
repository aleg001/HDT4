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

public class StackVector<E> extends Stack<E> {
    private Vector<E> datos;

 
 
    public StackVector() {
        datos = new Vector<E>();
    }


    @Override
    public boolean push(E item) {
        datos.add(item);
        return true;     
    }


    @Override
    public E peek() {
        return(datos.get(datos.size() - 1));
    }


    @Override
    public boolean isEmpty() {
        return datos.isEmpty();
    }

    @Override
    public int count() {
        return datos.size();
    }



    @Override
    public E pop() {
        return (datos.remove(datos.size() - 1));
    }
}