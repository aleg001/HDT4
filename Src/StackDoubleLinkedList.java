/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* StackDoubleLinkedList.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

/**
 * @author moise
 *
 */
public class StackDoubleLinkedList<E> extends Stack<E> {

	ListDoubleLinkedList<E> core;
	
	public StackDoubleLinkedList() {
		core = new ListDoubleLinkedList<E>();
	}
	
	@Override
	public boolean push(E element) {
		return core.insert(element);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pop() {
		return core.removeAtEnd();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return core.count();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return core.isEmpty();
	}

}
