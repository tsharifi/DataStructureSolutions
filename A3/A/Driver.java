// Moein Sharifi Moghaddam
// Assignment 3 part A
// T00665076
// implementing stack using linked list



import java.util.*;

public class Driver {

    public static void main (String args[])
    {
        LinkedStack<Integer> linked_stack = new LinkedStack<Integer>(); 
        // System.out.println(linked_stack); 
        System.out.println("----------------");
        System.out.println("Empty Stack Test"); 
        System.out.println("----------------");
        System.out.println("The size of empty stack: " + linked_stack.size());
        System.out.println("The stack is empty: " + linked_stack.isEmpty());
        System.out.println();

        // tests peek when the stack is empty. should throw exception 
        System.out.println("----------------");
        System.out.println("Peek Empty Stack");
        System.out.println("----------------");
        try
        {
            Integer peek = linked_stack.peek();
        } 
        catch (EmptyCollectionException e)
        {
            System.out.println("Exception: " + e.getMessage());
            System.out.println();
        }

        // pop when stack is empty. should throw exception
        System.out.println("--------------------");
        System.out.println("Pop empty stack test");
        System.out.println("--------------------");
        try
        {
            Integer pop = linked_stack.pop();
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
            // Test push function in implemting a stack and updates\
            //i in each step updates peek, size of stack, if stack is empty and prints elements in stack in order 
            for(int i = 1; i <= 5; i++)
            {
                linked_stack.push(i);
                System.out.println("peek: " + linked_stack.peek()); 
                System.out.println("size: " + linked_stack.size()); 
                System.out.println("is empty: " + linked_stack.isEmpty()); 
                System.out.println("print stack: " + linked_stack.toString()); 
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: Problem Occured During Push Function Test");
            System.out.println("size: " + linked_stack.size()); 
            System.out.println("is empty: " + linked_stack.isEmpty()); 
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("perform pop three times off the stack and print poped element, peek, size, isEmpty and toString for each pop");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        try
        {
        // pop elements repetitive
        // in each steps updates poped element, peek of stack, size of stack, check if stack is empty and prints all elemtnts in the stack after each pop 
            for(int i = 0; i < 5; i++)
            {
                System.out.println("pop: " + linked_stack.pop());
                System.out.println("peek: " + linked_stack.peek()); 
                System.out.println("size: " + linked_stack.size()); 
                System.out.println("is empty: " + linked_stack.isEmpty()); 
                System.out.println("print stack: " + linked_stack.toString()); 
                System.out.println();
            }
        } catch (Exception e)
        {
            System.out.println("Exception: Problem Occured During Pop Function Test");
        }
    }
}