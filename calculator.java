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

	public static double divide(double n1, double n2) throws ArithmeticException {
		if (n2 == 0) throw new ArithmeticException("Division by zero.");
		return n1 / n2; // Return result and accomodate error messages
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

			double result = 0;
			boolean validOperation = true;
			
			switch (operation) {
				case '+':
					result = add(num1, num2);
					break;
				case '-':
					result = subtract(num1, num2);
					break;
				case '*':
					result = multiply(num1, num2);
					break;
				case '/':
					result = divide(num1, num2); //divide already returns a String
					break;
				default:
					System.out.println("Invalid operation. Please use +, -, *, or /.");
					validOperation = false;
			}

			System.out.println("-----------------");
			// Check if the result from divide() was an error message
			if (validOperation) {
				System.out.println("The result is: " + result);
			} 
		} catch (InputMismatchException ime) {
			System.out.println("-----------------");
			System.out.println("Invalid number entered. Please enter numeric value only");
		} catch (ArithmeticException ae) {
			System.out.println("-----------------");
			System.out.println("Error: " + ae.getMessage());
		} catch (Exception e) {
			System.out.println("-----------------");
			System.out.println("An unexpected error occurred: " + e.getMessage());
		} finally {
			scanner.close(); // Close the scanner to free resources
		}
	}
}
