package utilities;

import java.util.Iterator;

/**
* An interface defining a general queue - utilizes FIFO.
*
* @param <E> elements in the queue
*/
public interface QueueADT<E> {

	/**
	 * Adds an element in last place of the queue.
	 * 
	 * @param element - element to insert
	 * 
	 * pre-condition: element can't be null
	 * post-condition: element is added to end of queue
	 */
	public void enqueue(E element);
	
	/**
	 * Removes element in first place of the queue.
	 * 
	 * @return first element inserted in queue
	 * 
	 * pre-condition: can't have empty queue
	 * post-condition: first element removed from queue
	 */
	public E dequeue();
	
	/**
	 * Retrieves the first element of queue.
	 * 
	 * @return the first queue element
	 * 
	 * pre-condition: can't have empty queue
	 * post-condition: queue is not changed
	 */
	public E peek();
	
	/**
	 * Returns true if queue is empty and false if elements are stored.
	 * 
	 * @return true if queue has no elements
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of elements in queue.
	 * 
	 * @return how many elements are stored
	 */
	public int size();
	
	/**
	 * Returns true if 'that' matches another queue.
	 * 
	 * @param that - 'that' as queue to compare
	 * @return true if queues are matching
	 * 
	 * pre-condition: 'that' can't be null
	 */
	public boolean equals(QueueADT<E> that);
	
	/**
	 * Returns an iterator for the queue.
	 * 
	 * @return iterator for queue
	 */
	public Iterator<E> iterator();
	
	/**
	 * Creates an array copied from elements of queue.
	 * 
	 * @return queue elements array 
	 */
	public Object[] toArray();
	
	/**
	 * Creates a copy of elements into a chosen array.
	 * 
	 * @param copy - copy array for storing elements
	 * @return array of queue elements
	 * pre-condition: 'copy' can't be null
	 */
	public E[] toArray(E[] copy);
	
	/**
	 * Returns true if queue limit is reached.
	 * 
	 * @return true if queue is full and false if space available
	 */
	public boolean isFull();
	
	/**
	 * Empties all queue contents/elements.
	 * 
	 * post-condition: queue doesn't have elements stored
	 */
	public void dequeueAll();
}
