package week1.day2;

public class Palindrome {

	/*
	 * Check the given number is palindrome or not Int num =3434 Initialize a
	 * temporary variable. Reverse the number (using for loop and add to the
	 * temporary variable) Compare the temporary number with reversed number If both
	 * numbers are same, print "palindrome number" Else print
	 * "not palindrome number"
	 */

	public static void main(String[] args) {
		int num = 34343;
		int temp, i;
		temp = num;
		for (i = 0; num > 0; num = num / 10) {
			int rem = num % 10;
			i = (i * 10) + rem;// 4//5//4
		}

		if (i == temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
