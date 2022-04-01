// Moein Sharifi Moghaddam
// Assignment 3 part B
// T00665076
// Implementing stack using ArrayList

import java.util.*;


public class Driver {

    public static void main (String args[])
    {
        ArrayStack<Integer> array_stack = new ArrayStack<Integer>(3); 
        System.out.println("----------------");
        System.out.println("Empty Stack Test"); 
        System.out.println("----------------");
        System.out.println("The size of empty stack: " + array_stack.size()); // size of stack when empty
        System.out.println("The stack is empty: " + array_stack.isEmpty()); // returns if stack is empty or not
        System.out.println();

        System.out.println("----------------");
        System.out.println("Peek Empty Stack");
        System.out.println("----------------");
        try
        {
            Integer peek = array_stack.peek();
        } 
        catch (EmptyCollectionException e)
        {
            System.out.println("Exception: " + e.getMessage());
            System.out.println();
        }

        System.out.println("--------------------");
        System.out.println("Pop empty stack test");
        System.out.println("--------------------");
        // pops top element of an empty stack. should throw an EmptyCollectionException
        try
        {
            Integer pop = array_stack.pop();
        } 
        catch (EmptyCollectionException e)
        {
            System.out.println("Exception: " + e.getMessage());
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Push 1-5 to the stack and print peek, size, isEmpty and toString for each push");
        System.out.println("------------------------------------------------------------------------------");

        try 
        {
            // Pushing elements 1-5 repetetively 
            for(int i = 1; i <= 5; i++)
            {
                array_stack.push(i);
                System.out.println("peek: " + array_stack.peek()); 
                System.out.println("size: " + array_stack.size()); 
                System.out.println("is empty: " + array_stack.isEmpty()); 
                System.out.println("print stack: " + array_stack.toString()); 
                System.out.println();

            }
        }catch(Exception e)
        {
            System.out.println("Excepiton: Problem Occured During Pushing New Element");
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("perform pop three times off the stack and print poped element, peek, size, isEmpty and toString for each pop");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        try
        {
            // poping all elements pushed repetetively 
            for(int i = 0; i < 5; i++)
            {
                System.out.println("pop: " + array_stack.pop());
                System.out.println("peek: " + array_stack.peek()); 
                System.out.println("size: " + array_stack.size()); 
                System.out.println("is empty: " + array_stack.isEmpty()); 
                System.out.println("print stack: " + array_stack.toString()); 
                System.out.println();
            }
        } catch(EmptyCollectionException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}