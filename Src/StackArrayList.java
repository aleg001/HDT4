import java.util.ArrayList;

/**
 * @author Alejandra Guzman  
 * @author Alejandro Gomez
 * @param <E> type of object
 */


public class StackArrayList<E> extends Stack<E> {
    protected ArrayList<E> core;
	
	public StackArrayList() {
		core = new ArrayList<E>();
	}
	
	@Override
	public boolean push(E element) {
		return core.add(element);
	}

	@Override
	public E peek() {
		return core.get(core.size() - 1);
	}

	@Override
	public E pop() {
		return core.remove(core.size() - 1);
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