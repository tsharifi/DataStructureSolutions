//package jsjf;
import java.util.*;

/**
 * Represents a node in a linked list.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class DoubleNode<T> 
{
	private DoubleNode<T> next;
    private DoubleNode<T> previous; 
	private T element;

	/**
	 * Creates an empty node.
	 */
	public DoubleNode()
	{
		next = previous = null;
		element = null;
	}

	/**
	 * Creates a node storing the specified element.
	 * @param elem element to be stored
	 */
	public DoubleNode(T elem)
	{
		next = previous = null;
		element = elem;
	}

	/**
	 * Returns the node that follows after this one.
	 * @return reference to next node
	 */
	public DoubleNode<T> getNext()
	{
		return next;
	}

    /**
	 * Returns the node that follows before this one.
	 * @return reference to previous node
	 */
	public DoubleNode<T> getPrevious()
	{
		return previous;
	}

	/**
	 * Sets the node that follows this one.
	 * @param node node to follow this one
	 */
	public void setNext(DoubleNode<T> node)
	{
		next = node;
	}

    /**
	 * Sets the node that follows before this one.
	 * @param node node to follow before this one
	 */
	public void setPrevious(DoubleNode<T> node)
	{
		previous = node;
	}

	/**
	 * Returns the element stored in this node.
	 * @return element stored at the node
	 */
	public T getElement()
	{
		return element;
	}

	/**
	 * Sets the element stored in this node.
	 * @param elem element to be stored at this node
	 */
	public void setElement(T elem)
	{
		element = elem;
	}
}
