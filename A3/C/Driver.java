// Moein Sharifi Moghaddam
// Assignment 3 part c
// Main dive for testing a queue implemented by Linked List
// T00665076

import java.util.*; 

public class Driver {

    public static void main (String args[])
    {
        LinkedQueue<Integer> linked_queue = new LinkedQueue<Integer>(); 

        
        System.out.println("-------------------");
        System.out.println("Testing Empty Queue");
        System.out.println("-------------------");
        // check size of queue and if it is empty. 
        // it should be empty and size should be zero. 
        System.out.println("size of queue: " + linked_queue.size());
        System.out.println("queue is empty: " + linked_queue.isEmpty());
        System.out.println();

        System.out.println("---------------------------");
        System.out.println("Testing first in empty queue");
        System.out.println("---------------------------");
        // try to get the first element in an empty queue
        // exptected to throw EMptyCollectionException
        try 
        {
            linked_queue.first(); 
        } 
        catch(EmptyCollectionException e)
        {
            System.out.println("exception: " + e.getMessage());
        }

        System.out.println();

        System.out.println("------------------------------");
        System.out.println("Testing dequeue in empty queue");
        System.out.println("------------------------------");
        // try to dequeue an element from an empty queue
        // expect to throw EmptyCollectionException
        try 
        {
            linked_queue.dequeue(); 
        } 
        catch(EmptyCollectionException e)
        {
            System.out.println("exception: " + e.getMessage());
        }
        System.out.println();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Enquue elements repeatedly and test size, isEmpty in each step");
        System.out.println("--------------------------------------------------------------");
        // Repetitively Enqueue elements into the queue and print result in each step 
        try
        {
            for(int i = 1; i < 11; i++)
            {
                linked_queue.enqueue(i); 
                System.out.println("Enqueued value: " + i);
                System.out.println("Size of queue: " + linked_queue.size());
                System.out.println("queue is empty: " + linked_queue.isEmpty()); 
                System.out.println("print queue: " + linked_queue.toString());
                System.out.println();

            }
        } catch(Exception e) {
            System.out.println("Exception: Problem Occured");
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Dequeue repeatedly and test size, isEmpty in each step");
        System.out.println("------------------------------------------------------");
        // pop element repetitvely and throws exception when queue is empty
        try {
            for(int i = 1; i < 11; i++)
            {
                linked_queue.dequeue(); 
                System.out.println("Dnqueued value(first): " + linked_queue.first());
                System.out.println("Size of queue: " + linked_queue.size());
                System.out.println("queue is empty: " + linked_queue.isEmpty()); 
                System.out.println("print queue: " + linked_queue.toString());
                System.out.println();
    
            }
        } catch (EmptyCollectionException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    
}
