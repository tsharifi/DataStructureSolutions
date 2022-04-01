// Moein Sharifi Moghaddam
// T00665076
// Assignment 4 part B, Comp 2231

import java.io.*;

public class Driver {
    
    public static void main(String[] args) throws FileNotFoundException
    {
    	
    	
    	// Test Case for Linked Binary Tree Methods 
         LinkedBinarySearchTree<Integer> search_tree = new LinkedBinarySearchTree<Integer>(); 
         System.out.println("The Search Tree is Empty: " + search_tree.isEmpty()); 
         // adds elements to the tree repeatedly 
         search_tree.addElement(1); 
         search_tree.addElement(2); 
         search_tree.addElement(23); 
         search_tree.addElement(4); 
         search_tree.addElement(15); 
         search_tree.addElement(36); 
         search_tree.addElement(7); 
         search_tree.addElement(28); 
         search_tree.addElement(9);
         search_tree.addElement(15); 
         
         // Print result of the methods
         System.out.println("Search Binary Tree: \n------------------\n" + search_tree); 
         System.out.println("Height of Tree: " + search_tree.getHeight());
         System.out.println("The Maximum Element Value: " + search_tree.findMax()); 
         System.out.println("The Minimum Element Value: " + search_tree.findMin());
         System.out.println("Left Subtree: \n------------------\n" + search_tree.getLeft());
         System.out.println("Right Subtree: \n------------------\n" + search_tree.getRight());


         // print tree after removal methods test
         search_tree.removeMax(); 
         search_tree.removeMin(); 
         search_tree.removeAllOccurrences(15);
         search_tree.removeElement(4); 
         System.out.println("Search Binary Tree After Removals (All Occurance of 15, Max, Man and Value 4): \n----------------------------\n" + search_tree);
         
         // Degenerate tree test case 1
         LinkedBinarySearchTree<Integer> unbalance1 = new LinkedBinarySearchTree<Integer>();
         unbalance1.addElement(7);
         unbalance1.addElement(6);
         unbalance1.addElement(12);
         unbalance1.addElement(31);
         unbalance1.addElement(21);
         unbalance1.addElement(13);
         unbalance1.addElement(30);
         
         System.out.println("DEGENERATE TREE TEST CASE 1"); 
         System.out.println("---------------------------"); 
         System.out.println("The Hight of the Degenerate Tree: " + unbalance1.getHeight());
         unbalance1.bruteForce(); 
         System.out.println("The Hight of the Degenerate Tree After BruteForceBalance: " + unbalance1.getHeight());
         System.out.println("Left Subtree: \n------------------\n" + unbalance1.getLeft());
         System.out.println("Right Subtree: \n------------------\n" + unbalance1.getRight());
         System.out.println("Root of Tree: \n------------------\n" + unbalance1.getRootElement());
         
         
         // Degenerate tree test case 2
         LinkedBinarySearchTree<Integer> unbalance2 = new LinkedBinarySearchTree<Integer>();
         unbalance2.addElement(65);
         unbalance2.addElement(15);
         unbalance2.addElement(54);
         unbalance2.addElement(38);
         unbalance2.addElement(22);
         unbalance2.addElement(39);
         unbalance2.addElement(66);
         
         System.out.println("DEGENERATE TREE TEST CASE 2"); 
         System.out.println("---------------------------"); 
         System.out.println("The Hight of the Degenerate Tree: " + unbalance2.getHeight());
         unbalance2.bruteForce(); 
         System.out.println("The Hight of the Degenerate Tree After BruteForceBalance: " + unbalance2.getHeight());
         System.out.println("Left Subtree: \n------------------\n" + unbalance2.getLeft());
         System.out.println("Right Subtree: \n------------------\n" + unbalance2.getRight());
         System.out.println("Root of Tree: \n------------------\n" + unbalance2.getRootElement());
         
         unbalance2.addElement(55);
         unbalance2.addElement(77);
         unbalance2.addElement(16);
         unbalance2.addElement(91);
         unbalance2.addElement(88);
         
      // Adding elements to the already balanced tree from test case 2, prints its height, rebalances it and then prints height of rebalanced tree
         System.out.println("The Hight of Balance Tree after adding Five Elemens: " + unbalance2.getHeight());
         unbalance2.bruteForce(); 
         System.out.println("The Hight of Tree Again After BruteForceBalance: " + unbalance2.getHeight());
         
    }

}
