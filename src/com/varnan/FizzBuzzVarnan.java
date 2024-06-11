package com.varnan;

import java.util.Scanner;

/**
 * @author Varnan Goenka 02/12/2024 An implementation of the FizzBuzz game.
 */
public class FizzBuzzVarnan {
	/**
	 * Main method
	 * 
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get the last number for the FizzBuzz game from the user
		System.out.println("Enter your last number: ");
		int lastNumber = input.nextInt();

		// Execute the FizzBuzz game
		fizzBuzz(1, lastNumber);
	}
	/**
	 * Executes the FizzBuzz game from the starting number to the ending number.
	 * @param startNumber The starting number for the FizzBuzz game.
	 * @param endNumber   The ending number for the FizzBuzz game.
	 */
	public static void fizzBuzz(int startNumber, int endNumber) {
		for (int i = startNumber; i <= endNumber; i++) {
			// If the number is divisible by 15, print "FizzBuzz"
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
				// If the number is divisible by 5, print "Buzz"
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
				// If the number is divisible by 3, print "Fizz"
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
				// If the number is not divisible by 3, 5, or 15, print the number itself
			} else {
				System.out.println(i);
			}
		}
	}
}
