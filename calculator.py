# calculator.py

def  add(n1, n2):
	return n1 + n2

def subract(n1, n2):
	return n1 - n2

def multiply(n1, n2):
	return n1 * n2

def devide(n1, n2):
	if n2 == 0:
		return "Error! Division by zero"
	return n1 / n2

print("Simple Calculator")
print("-----------------")

try:
	num1 = float(input("Enter the first number: "))
	operation = input("Enter operation (+, -, *, /): ")
	num2 = float(input("Enter the second number: "))

	result = None # Initialize result to None

	if operation == "+":
		result = add(num1, num2)
	elif operation == "-":
		result = subract(num1,num2)
	elif operation == "*":
		result = multiply(num1, num2)
	elif operation == "/":
		result = devide(num1, num2)
	else:
		result = "Invalid operation. Please use +, -, *, or /."

		print("-----------------")
		if isinstance(result, str): # Check if result is an error message string
			print(result)
		else:
			print(f"The result is: {result}")

except ValueError:
	print("-----------------")
	print("Invalid input. Please enter valid numbers.")
except Exception as e:
	print("-----------------")
	print(f"An unexpected error occured: {e}")





