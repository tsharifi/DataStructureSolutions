// Moein Sharifi Moghaddam
// T00665076
// Assignment 4 part A, Comp 2231

import java.io.*;

/**
 *ChatBot Serves Customer through Automation
 */
public class customerServiceChatBot
{
	/**Y
	 *  Asks questions of the user to Serve Customer Through Automated Chatbot
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Welcome to Customer Support");

		DecisionTree expert = new DecisionTree("customerServiceChatBot.txt");
		expert.evaluate();
	}
}
