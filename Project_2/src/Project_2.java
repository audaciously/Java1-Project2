
/** This program is a calculator that prints out results of simple operations.
 *@author Abigail Clarke
 *@version 1.0
 *I copied the outputs from the Project 2 Handout, but it's OK because
 *Sudhi told me to.
 *The instructions from the PDF for naming the project and class were not the same 
 *throughout the document, so I followed what seemed to actually run in the Zybooks IDE.
 */

import java.util.Scanner;

public class Project_2 {

	// This is the main program that runs for every method (every operation).
	public static void main(String[] args) {

		int operation;
		double firstNum;
		double secondNum;
		double result;

		Scanner keyboard = new Scanner(System.in);

		System.out.println ("Welcome to the simple calculator");
		System.out.println ("Enter the operation to be performed");
		System.out.println ("1. Addition (+)");
		System.out.println ("2. Subtraction (–)");
		System.out.println ("3. Multiplication (x)");
		System.out.println ("4. Division (/)");
		System.out.println ("5. Remainder (%)");
		System.out.println ("Input:");
		
		operation = keyboard.nextInt();

		// This is the branch that runs for addition operations.
		if (operation == 1) {

			System.out.println("Enter the two numbers for addition operation");
			System.out.println("First number:");
			firstNum = keyboard.nextDouble();
			System.out.println("Second number:");
			secondNum = keyboard.nextDouble();
			result = firstNum + secondNum;
			System.out.println("The sum of two numbers is " + result);

		}

		// This is the branch that runs for subtraction operations.
		else if (operation == 2) {

			System.out.println("Enter the two numbers for subtraction operation");
			System.out.println("First number:");
			firstNum = keyboard.nextDouble();
			System.out.println("Second number:");
			secondNum = keyboard.nextDouble();
			result = firstNum - secondNum;
			System.out.println("The difference between two numbers is " + result);

		}

		// This is the branch that runs for multiplication operations.
		else if (operation == 3) {

			System.out.println("Enter the two numbers for multiplication operation");
			System.out.println("First number:");
			firstNum = keyboard.nextDouble();
			System.out.println("Second number:");
			secondNum = keyboard.nextDouble();
			result = firstNum * secondNum;
			System.out.println("The product of two numbers is " + result);

		}

		// This is the branch that runs for division operations.
		else if (operation == 4) {

			System.out.println("Enter the two numbers for division operation");
			System.out.println("First number:");
			firstNum = keyboard.nextDouble();
			System.out.println("Second number:");
			secondNum = keyboard.nextDouble();

			/**
			 * This branch runs if 0 is input for the denominator, making the value of the
			 * fraction undefined.
			 */
			if (secondNum == 0) {
				System.out.println("Error: Please enter a non-zero value for the denominator.");
			}

			/*
			 * This branch runs if a non-zero number is input for the denominator which
			 * renders a real number value that the calculator can compute.
			 */
			else {
				result = firstNum / secondNum;
				System.out.println("The quotient of two numbers is " + result);
			}
		}

		// This is the branch that runs for remainder operations.
		else if (operation == 5) {

			System.out.println("Enter the two numbers for remainder operation");
			System.out.println("First number:");
			firstNum = keyboard.nextDouble();
			System.out.println("Second number:");
			secondNum = keyboard.nextDouble();

			/**
			 * This branch runs if 0 is input for the denominator, making the value of the
			 * fraction undefined.
			 */
			if (secondNum == 0) {
				System.out.println("Error: Please enter a non-zero value for the denominator.");
			}

			/*
			 * This branch runs if a non-zero number is input for the denominator which
			 * renders a real number value that the calculator can compute.
			 */
			else {
				result = firstNum % secondNum;
				System.out.println("The remainder of two numbers is " + result);
			}
		}

		/*
		 * This is the branch that runs if an invalid integer is input for the operation
		 * to be performed
		 */
		else {
			System.out.println("Please enter a valid option from above.");

		}
	}
}
