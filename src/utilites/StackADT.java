package utilites;

/**
 * An interface that defines a generic stack.
 * 
 * @param <E> the element to be stored in the stack
 */
public interface StackADT<E> {

	/**
	 * Pushes an element to the top of the stack.
	 * 
	 * Preconditions:
	 * - element is not null
	 * 
	 * Postconditions:
	 * - element is added to the top of the stack
	 * 
	 * @param element the element to push onto the stack
	 * @throws NullPointerException if element is null
	 */
	public void push(E element);

	/**
	 * Removes and returns the top element of the stack.
	 * 
	 * Preconditions:
	 * - the stack is not empty
	 * 
	 * Postconditions:
	 * - the top element is removed from the stack
	 * 
	 * @return the element removed from the top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public E pop();

	/**
	 * Returns the top element of the stack without removing it.
	 * 
	 * Preconditions:
	 * - the stack is not empty
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @return the element at the top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public E peek();

	/**
	 * Checks whether the stack is empty.
	 * 
	 * Preconditions:
	 * - none
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @return true if the stack contains no elements, false otherwise
	 */
	public boolean isEmpty();

	/**
	 * Returns the number of elements in the stack.
	 * 
	 * Preconditions:
	 * - none
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @return the number of elements in the stack
	 */
	public int size();

	/**
	 * Removes all elements from the stack.
	 * 
	 * Preconditions:
	 * - none
	 * 
	 * Postconditions:
	 * - the stack is empty
	 */
	public void clear();

	/**
	 * Determines whether the stack contains the specified element.
	 * 
	 * Preconditions:
	 * - element is not null
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @param element the element to search for
	 * @return true if the element is found, false otherwise
	 * @throws NullPointerException if element is null
	 */
	public boolean contains(E element);

	/**
	 * Searches for the specified element in the stack.
	 * The top element is at position 1.
	 * 
	 * Preconditions:
	 * - element is not null
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @param element the element to search for
	 * @return the position of the element from the top of the stack,
	 *         or -1 if the element is not found
	 * @throws NullPointerException if element is null
	 */
	public int search(E element);

	/**
	 * Returns an array containing all elements in the stack.
	 * 
	 * Preconditions:
	 * - none
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @return an array containing all elements in the stack
	 */
	public Object[] toArray();

	/**
	 * Returns an array containing all elements in the stack.
	 * 
	 * Preconditions:
	 * - copy is not null
	 * 
	 * Postconditions:
	 * - the stack is unchanged
	 * 
	 * @param copy the array into which the stack elements are stored
	 * @return an array containing all stack elements
	 * @throws NullPointerException if copy is null
	 */
	public E[] toArray(E[] copy);

	/**
	 * Compares this stack with another stack.
	 * 
	 * Preconditions:
	 * - that is not null
	 * 
	 * Postconditions:
	 * - neither stack is modified
	 * 
	 * @param that the stack to compare with
	 * @return true if both stacks contain the same elements
	 *         in the same order; false otherwise
	 * @throws NullPointerException if that is null
	 */
	public boolean equals(StackADT<E> that);
}