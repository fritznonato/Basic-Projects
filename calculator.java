// Calculator.java

import java.util.InputMismatchException;
import java.util.Scanner; // Import the Scanner class for the user input

public class Calculator {

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtract(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	public static String divide(double n1, double n2) {
		if (n2 == 0) {
			return "Error! Division by zero.";
		}
		return String.valueOf(n1 / n2); // Return result as a string to accomodate error message
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object

		System.out.println("Simple Calculator");
		System.out.println("-----------------");

		try {
			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble(); // Read user input as double

			System.out.println("Enter operation (+, -, *, /): ");
			char operation = scanner.next().charAt(0); //Read the first character of the input

			System.out.println("Enter the second number: ");
			double num2 = scanner.nextDouble();

			String resultString = ""; // To store a result of error message

			switch (operation) {
				case '+':
					resultString = String.valueOf(add(num1, num2));
					break;
				case '-':
					resultString = String.valueOf(subtract(num1, num2));
					break;
				case '*':
					resultString = String.valueOf(multiply(num1, num2));
					break;
				case '/':
					resultString = divide(num1, num2); //divide already returns a String
					break;
				default:
					resultString = "Invalid operation. Please use +, -, *, or /.";
					break;
			}

			System.out.println("-----------------");
			// Check if the result from divide() was an error message
			if (resultString.startsWith("Error!")) {
				System.out.println(resultString);
			} else {
				// If it's not an error, try to parse it as a double for formatting
				// Or just print resultString directly
				System.out.println("The result is: " + resultString); 
			} 

		} catch (Exception e) {
				System.out.println("-----------------");
				System.out.println("An unexpected error occurred: " + e.getMessage());
		} finally {
				scanner.close(); // Close the scanner to free resources
		}
	}
}
