//package jsjf;

//import jsjf.exceptions.*;
import java.util.Iterator;
import java.util.*;

/**
 * LinkedQueue represents a linked implementation of a queue.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedDeque<T> implements DequeADT<T>
{
// 	private int count;
// 	private LinearNode<T> head, tail;

	private int count;
    private DoubleNode<T> first;  
    private DoubleNode<T> last; 

	/**
	 * Creates an empty queue.
	 */
 	public void LinkedDeque()
	{		
		count = 0;
		first = last = null;
 	}

	/**
	 * Adds the specified element to the tail of this queue.
	 * * throws exception if intended enque value is empty.
	 * @param element the element to be added to the tail of the queue
	 */
	public void enque_front(T element)
	{
		DoubleNode<T> temp = new DoubleNode<T>(element);
		if (element == null)
		{
			throw new EmptyCollectionException("element"); 
		}
		if (first == null)
		{
			first = temp; 
			last = temp; 
		} else 
		{
			first.setPrevious(temp); 
			temp.setNext(first); 
			first = temp; 
		}
		count++; 
		
	}

	/**
	 * throws exception if intended enque value is empty
	 * Adds the specified element to the tail of this queue.
	 * @param element the element to be added to the tail of the queue
	 */
	public void enque_back(T element)
	{
		DoubleNode<T> temp = new DoubleNode<T>(element);
		if (element == null)
		{
			throw new EmptyCollectionException("Element"); 
		}
		if (first == null)
		{
			first = null; 
			last = null; 
		} else 
		{
			last.setNext(temp); 
			temp.setPrevious(last);
			last = temp; 
		}
		count++; 
	}	

	/**
	 * Removes the element at the head of this queue and returns a
	 * reference to it. 
	 * @return the element at the head of this queue
	 * @throws EmptyCollectionException if the queue is empty
	 */
	public T deque_front() throws EmptyCollectionException
	{
		if (isEmpty())
		{
			throw new EmptyCollectionException("queue");
		}
		T result = first.getElement();
		first = first.getNext();
		first.setPrevious(null);
		count--;

		if (isEmpty())
		{
			last = null;
			first = null; 
		}
		return result;
	}

	/*
	 * Removes the element at the end of this queue and returns a
	 * reference to it. 
	 * @return the element at the end of this queue
	 * @throws EmptyCollectionException if the queue is empty
	 */
	public T deque_back() throws EmptyCollectionException
	{
		if (isEmpty())
		{
			throw new EmptyCollectionException("queue");
		}
		T result = last.getElement();
		last = last.getPrevious();
		last.setNext(null);
		count--;

		if (isEmpty())
		{
			last = null;
			first = null; 
		}
		return result;
	}

	/**
	 * Returns a reference to the element at the head of this queue.
	 * The element is not removed from the queue.  
	 * @return a reference to the first element in this queue
	 * @throws EmptyCollectionsException if the queue is empty
	 */
	public T first() throws EmptyCollectionException
	{
		if (isEmpty())
		{
			throw new EmptyCollectionException("queue"); 
		}
		return first.getElement(); 
	}

	/**
	 * Returns a reference to the element at the bottom of this queue.
	 * The element is not removed from the queue.  
	 * @return a reference to the first element in this queue
	 * @throws EmptyCollectionsException if the queue is empty
	 */
	public T last() throws EmptyCollectionException
	{
		if (isEmpty())
		{
			throw new EmptyCollectionException("queue"); 
		}
		return last.getElement(); 
	}

	/**
	 * Returns true if this queue is empty and false otherwise. 
	 * @return true if this queue is empty 
	 */
	public boolean isEmpty()
	{
		return (count == 0); 
	}

	/**
	 * Returns the number of elements currently in this queue.
	 * @return the number of elements in the queue
	 */
	public int size()
	{
		return count;  
	}

	/**
	 * Returns a string representation of this queue. 
	 * @return the string representation of the queue
	 */
	public String toString()
	{
		String result = "{";
        DoubleNode<T> current = first;

        while (current != null)
        {
			result = result + current.getElement() + ", ";
			current = current.getNext();			
			if (current == last)
			{
				result = result + current.getElement() + "}";
				current = current.getNext(); 
			}
	
        }

        return result;
	}
 }
