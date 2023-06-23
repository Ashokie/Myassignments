package week1.day2;

public class PrimeNumber {
	// Goal: To find whether a number is a Prime number or not

	// input: 13

	// output: 13 is a Prime Number

	// Shortcuts:

	// 1) Print : type: syso, followed by: ctrl + space + enter

	// 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow
	// + enter

	// * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down
	// arrow + enter/
	public static void main(String[] args) {

		int input = 13;

		// Declare an int Input and assign a value 13

		// Declare a boolean variable flag as false
		boolean j = false;

		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				j = true;
			}
		}
		if (j == false)
			System.out.println("Prime");
		else
			System.out.println("Not a prime");
		// Divide the input with each for loop variable and check the remainder

		// Set the flag as true when there is no remainder

		// break the iterator

		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match
	}
}