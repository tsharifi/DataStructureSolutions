import java.util.*; 

public class LinkedQueue<T> implements QueueADT<T> {

    LinkedList queue; 

    LinkedQueue()
    {
        queue = new LinkedList(); 
    }

    /**  
	 * Adds one element to the rear of this queue. 
	 * @param element  the element to be added to the rear of the queue  
	 */
	public void enqueue(T element)
    {
        queue.add(element); 
    }

    /**  
	 * Removes and returns the element at the front of this queue.
	 * @return the element at the front of the queue
	 */
	public T dequeue()
    {
        if(isEmpty())
        {
            throw new EmptyCollectionException("QUEUE"); 
        }
        T temp = (T)queue.get(0); 
        queue.remove(0); 
        return temp; 
    }

    /**  
	 * Returns without removing the element at the front of this queue.
	 * @return the first element in the queue
	 */
	public T first()
    {
        if(isEmpty())
        {
            throw new EmptyCollectionException("Queue");    
        }
        return (T)queue.get(0); 
    }

    /**  
	 * Returns true if this queue contains no elements.
	 * @return true if this queue is empty
	 */
	public boolean isEmpty()
    {
        if(size() >= 1)
        {
            return false; 
        } else 
        {
            return true; 
        }
    }

    /**  
	 * Returns the number of elements in this queue. 
	 * @return the integer representation of the size of the queue
	 */
	public int size()
    {
        return queue.size(); 
    }

    /**  
	 * Returns a string representation of this queue. 
	 * @return the string representation of the queue
	 */
	public String toString()
    {
        return queue.toString(); 
    }

    
}
