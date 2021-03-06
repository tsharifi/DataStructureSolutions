// Moein Sharifi Moghaddam
// T00665076
// Assignment 4 part A, Comp 2231


import java.io.*;
import java.util.*;

/**
 * BackPainAnaylyzer demonstrates the use of a binary decision tree to 
 * diagnose back pain.
 */
public class BackPainAnalyzer
{
	/**
	 *  Asks questions of the user to diagnose a medical problem.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("So, you're having back pain.");

		DecisionTree expert = new DecisionTree("input.txt");
		expert.evaluate();
	}
}
