package utilites;

/**
 * An interface that defines a generic stack
 * 
 * @param <E> the element to be stored in the stack
 */
public interface StackADT<E> {

	/**
	 * Pushes an element to the top of the stack.
	 * 
	 * Preconditions:
	 *  -data is not null
	 *  
	 * Postconditions: 
	 *  -element is added to top of stack
	 *  
	 * @param element the element to push onto the stack
	 * @throws NullPointerException if data is null
	 */
	public void push(E element);
	
	/**
	 * Removes and returns top element of the stack.
	 * 
	 * Preconditions:
	 *  -the stack is not empty
	 *  
	 *  Postconditions: 
	 *  -top element is removed from stack
	 *   
	 * @return element removed from top of stack
	 * @throws EmptyStackException if stack is empty
	 */
	public E pop();
	
	/**
	 * Returns top element of the stack without removing it.
	 * 
	 * Preconditions:
	 *  -the stack is not empty
	 *  
	 *  Postconditions: 
	 *  -stack is unchanged
	 *   
	 * @return element at the top of stack
	 * @throws EmptyStackException if stack is empty
	 */
	public E peek();
	
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
