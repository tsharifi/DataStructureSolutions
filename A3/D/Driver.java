// Moein Sharifi Moghaddam
// Assignment 3 part D
// Implementing queue using Arraylist
// T00665076

import java.util.*;

public class Driver {

    public static void main (String args[])
    {
        ArrayQueue<Integer> array_queue = new ArrayQueue<Integer>(); 


        System.out.println("-------------------");
        System.out.println("Testing Empty Queue");
        System.out.println("-------------------");
        System.out.println("size of queue: " + array_queue.size()); // PRINT SIZE OF AN EMPTY QUEUE
        System.out.println("queue is empty: " + array_queue.isEmpty()); // PRINT IF AN EMPTY QUEUE IS EMPTY OR NOT
        System.out.println();

        System.out.println("---------------------------");
        System.out.println("Testing first in empty queue");
        System.out.println("---------------------------");
        // get first element of an empty queue
        // should throw EmptyCollectionException
        try 
        {
            array_queue.first(); 
        } 
        catch(EmptyCollectionException e)
        {
            System.out.println("exception: " + e.getMessage());
        }

        System.out.println();

        System.out.println("------------------------------");
        System.out.println("Testing dequeue in empty queue");
        System.out.println("------------------------------");
        // dequeues from an empty queue
        // throws EmptyCOllectionException
        try 
        {
            array_queue.dequeue(); 
        } 
        catch(EmptyCollectionException e)
        {
            System.out.println("exception: " + e.getMessage());
        }
        System.out.println();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Enquue elements repeatedly and test size, isEmpty in each step");
        System.out.println("--------------------------------------------------------------");
        // Enqueue Elements repetitively 
        try
        {
            for(int i = 1; i < 11; i++)
            {
                array_queue.enqueue(i); 
                System.out.println("Enqueued value: " + i);
                System.out.println("Size of queue: " + array_queue.size());
                System.out.println("queue is empty: " + array_queue.isEmpty()); 
                System.out.println("First Element: " + array_queue.first());
                System.out.println("print queue: " + array_queue.toString());
                System.out.println();

            }
        } catch (Exception e) {
            System.out.println("Exception: Problem Occured while Enqueuing New Elements");
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Dequeue repeatedly and test size, isEmpty in each step");
        System.out.println("------------------------------------------------------");

        // pop elements repetitively 
        // throws EmtyCOllectionException once trying to pop when queue is empty
        try 
        {
            for(int i = 1; i < 11; i++)
            {
                System.out.println("Dnqueued value(first): " + array_queue.dequeue());
                System.out.println("Size of queue: " + array_queue.size());
                System.out.println("queue is empty: " + array_queue.isEmpty()); 
                System.out.println("First Element: " + array_queue.first());
                System.out.println("print queue: " + array_queue.toString());
                System.out.println();

            }
        } catch (EmptyCollectionException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}