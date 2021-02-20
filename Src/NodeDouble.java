/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* NodeDouble.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

/**
 * @author moise
 *
 */
public class NodeDouble<E> {
	public E value;
	public NodeDouble<E> next;
	public NodeDouble<E> prev;
	
	public NodeDouble(E element) {
		next = null;
		prev = null;
		value = element;
	}
}
