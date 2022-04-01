// Moein Sharifi Moghaddam
// T00665076

//package jsjf;

//import jsjf.exceptions.*;
//import java.util.Arrays;
import java.util.*;

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedStack<T>  implements StackADT<T>
{
	private LinkedList stack; 

	LinkedStack()
	{
		stack = new LinkedList(); 
	}

	/**  
	 * Adds the specified element to the top of this stack. 
	 * @param element element to be pushed onto the stack
	 */
	
	public void push(T element)
	{
		stack.add(element); 
	}	

	/**  
	 * Removes and returns the top element from this stack. 
	 * @return the element removed from the stack
	 */
	public T pop() 
	{
		if(isEmpty())
		{
			throw new EmptyCollectionException("STACK");
		} else 
		{
			return (T)stack.removeLast(); 
		}
	}

	/**  
	 * Returns without removing the top element of this stack. 
	 * @return the element on top of the stack
	 */
	public T peek() 
	{
		if(isEmpty())
		{
			throw new EmptyCollectionException("STACK"); 
		} else 
		{
			return (T)stack.getLast(); // this method in the course is presented as last() but found out getLast() is correct instead!!!
		}
	}	

	/**  
	 * Returns true if this stack contains no elements. 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return stack.isEmpty(); 
	}
	/** 
	 * Returns the number of elements in this stack. 
	 * @return the number of elements in the stack
	 */
	public int size()
	{
		return stack.size(); 
	}

	/**  
	 * Returns a string representation of this stack. 
	 * @return a string representation of the stack
	 */
	public String toString()
	{
		return stack.toString(); 
	}
}

