/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* IList.java
* Autores: Ale Gomez y Ale Guzman
* Fecha de creacion: 19/02/2021
* Ultima edicion: 19/02/2021
********************************************************/

/**
 * @author moise
 *
 */
public interface IList<E> {

	public boolean insert(E element);
	
	public boolean insertAt(E element, int index);
	
	public boolean insertAtStart(E element);
	
	public boolean insertAtEnd(E element);
	
	public E removeAt(int index);
	
	public E removeAtStart();
	
	public E removeAtEnd();
	
	public int count();
	
	public boolean isEmpty();
}
