/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* IStack.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

/**
 * @author moises
 *
 */
public interface IStack<E> {
	
	public boolean push(E item);
	
	public E peek(); 
	
	public E pop();
	
	public int count();
	
	public boolean isEmpty();
}
