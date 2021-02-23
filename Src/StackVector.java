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


	protected Vector<E> core;
	public StackVector(){
		core = new Vector<E>();
	}
	
	@Override
	public boolean push(E element) {
		core.add(element);
		return true;
	}

	@Override
	public E peek() {
		return (core.get(core.size()-1));
	}

	@Override
	public E pop() {
		return (core.remove(core.size()-1));
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
