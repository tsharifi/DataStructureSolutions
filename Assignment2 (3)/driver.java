//package jsjf; 
import java.util.*;


public class driver {

    public static void main (String[] args)
    {

        //generating a lined queue with 5 elements 
        LinkedDeque<Integer> linked_deque = new LinkedDeque<Integer>(); 
        linked_deque.enque_front(1); 
        linked_deque.enque_front(2);
        linked_deque.enque_front(3);
        linked_deque.enque_front(4);
        linked_deque.enque_front(5);
        System.out.println("Output of Current state of linked queue: " + linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size()); 
        System.out.println(""); 

        // add a new element to the front 
        linked_deque.enque_front(6); 
        System.out.println("Number 6 added to front of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println(""); 

        // add a new element to the front 
        linked_deque.enque_front(7); 
        System.out.println("Number 7 added to the front of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // add a new element to the back 
        linked_deque.enque_back(8); 
        System.out.println("Number 8 added to back of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // add a new element to the back
        linked_deque.enque_back(9); 
        System.out.println("Number 9 added to back of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // remove an element from front of queue
        linked_deque.deque_front(); 
        System.out.println("Removed an Element from the front of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");
    
        // remove an element from front of queue
        linked_deque.deque_front(); 
        System.out.println("Removed an Element from the front of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // remove an element from front of queue
        linked_deque.deque_front(); 
        System.out.println("Removed an Element from the front of queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // remove an element from back of the queue 
        linked_deque.deque_back();
        System.out.println("Removed an element from back of the queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // remove an element from back of the queue 
        linked_deque.deque_back();
        System.out.println("Removed an element from back of the queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");

        // remove an element from back of the queue 
        linked_deque.deque_back();
        System.out.println("Removed an element from back of the queue");
        System.out.println(linked_deque.toString()); 
        System.out.println("First element of queue is: " + linked_deque.first()); 
        System.out.println("Last element of queue is: " + linked_deque.last()); 
        System.out.println("Size of the queue is: " + linked_deque.size());
        System.out.println("");
    }
}