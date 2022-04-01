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
public class ArrayStack<T>  implements StackADT<T>
{
	private final static int DEFAULT_CAPACITY = 100;

	private int top;  
	public ArrayList stack;

	/**
	 * Creates an empty stack using the default capacity.
	 */
	public ArrayStack()
	{
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Creates an empty stack using the specified capacity.
	 * @param initialCapacity the initial size of the array 
	 */
	public ArrayStack(int initialCapacity)
	{
		stack = new ArrayList(initialCapacity); 
	}

	/**
	 * Adds the specified element to the top of this stack, expanding
	 * the capacity of the array if necessary.
	 * @param element generic element to be pushed onto stack
	 */
	public void push (T element)
	{
		stack.add(element);
	}

	/**
	 * Removes the element at the top of this stack and returns a
	 * reference to it. 
	 * @return element removed from top of stack
	 * @throws EmptyCollectionException if stack is empty 
	 */
	public T pop() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		T result = (T)stack.remove(stack.size() -1); 
		return result;
	} 

	/**
	 * Returns a reference to the element at the top of this stack.
	 * The element is not removed from the stack.  
	 * @return element on top of stack
	 * @throws EmptyCollectionException if stack is empty
	 */
	public T peek() throws EmptyCollectionException
	{
		if (isEmpty())	
		{
			throw new EmptyCollectionException("stack");
		} else
		{
			return (T)stack.get(stack.size() - 1); 
		}
	}

	/**
	 * Returns true if this stack is empty and false otherwise. 
	 * @return true if this stack is empty
	 */
	public boolean isEmpty()
	{
		if(stack.size() > 0)
		{
			return false;
		} else
		{
			return true; 
		}		
	}

	/**
	 * Returns the number of elements in this stack.
	 * @return the number of elements in the stack
	 */
	public int size()
	{
		// To be completed as a Programming Project
		
		return stack.size(); 
	}

	/**
	 * Returns a string representation of this stack. 
	 * @return a string representation of the stack	
	 */
	public String toString()
	{
		if (isEmpty() == true)
		{
			throw new EmptyCollectionException("stack");
		}
		return stack.toString();
	}
}

