package utilites;

/**
 * 
 * @param <T>
 */
public interface StackADT<T> {

	/**
	 * 
	 * @param element
	 */
	public void push(T element);
	
	/**
	 * 
	 * @return
	 */
	public T pop();
	
	/**
	 * 
	 * @return
	 */
	public T peek();
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * 
	 */
	public void clear();
	
}
