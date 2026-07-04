package utilities;

public interface QueueADT<E> {

	/**
	 * 
	 * @param element
	 */
	public void enqueue(E element);
	
	/**
	 * 
	 * @return
	 */
	public E dequeue();
	
	/**
	 * 
	 * @return
	 */
	public E first();
	
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
