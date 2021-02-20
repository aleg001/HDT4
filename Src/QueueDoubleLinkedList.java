/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* QueueDoubleLinkedList.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

/**
 * @author moise
 *
 */
public class QueueDoubleLinkedList<E> extends Queue<E> {

	ListDoubleLinkedList<E> core;
	
	public QueueDoubleLinkedList() {
		core = new ListDoubleLinkedList<E>();
	}
	
	@Override
	public boolean add(E element) {
		return core.insert(element);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove() {
		return core.removeAtStart();
	}

	@Override
	public int count() {
		return core.count();
	}

	@Override
	public boolean isEmpty() {
		return core.isEmpty();
	}

}
