package utilites;

public interface QueueADT<T> {

	/**
	 * 
	 * @param element
	 */
	public void enqueue(T element);
	
	/**
	 * 
	 * @return
	 */
	public T dequeue();
	
	/**
	 * 
	 * @return
	 */
	public T first();
	
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
}
