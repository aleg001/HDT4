/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* List.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

/**
 * @author moise
 *
 */
public abstract class List<E> implements IList<E> {

    public List(){
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
