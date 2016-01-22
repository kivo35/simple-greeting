/**
 * 
 */
package com.sqa.kv.greetings;

import java.util.Scanner;

/**
 * @author Kirill
 * 
 */
public class SimpleGreeting
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Declare variables
		String name;
		// Create local variable which contains Scanner object instance
		// to capture user input from keyboard
		Scanner scanner = new Scanner(System.in);
		// Greet the user
		System.out.println("Welcome to the Simple Greeting Application");
		// Request user's name
		System.out.print("Coult I please have your name? ");
		// Capture user name inside local variable name
		name = scanner.nextLine();
		// Say goodbye to user
		System.out.println("Thank you " + name + ". Good bye!");
		scanner.close();
	}
}
