/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* QueueList.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

import java.util.LinkedList;

/**
 * @author moise
 *
 */
public class QueueList<E> extends Queue<E> {

	protected LinkedList<E> core;
	
	public QueueList() {
		core = new LinkedList<E>();
	}
	
	@Override
	public boolean add(E element) {
		return core.add(element);
	}

	@Override
	public E peek() {
		return core.get(0);
	}

	@Override
	public E remove() {
		return core.removeFirst();
	}

	@Override
	public int count() {
		return core.size();
	}

	@Override
	public boolean isEmpty() {
		return core.isEmpty();
	}
	

}
