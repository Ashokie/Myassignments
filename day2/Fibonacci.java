package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		// Print first number
		// Iterate from 1 to the range
		// add first and second number assign to sum
		// Assign second number to the first number
		// Assign sum to the second number
		// print sum
		int n1 = 0;
		int n2 = 1;
		int range = 8;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i < range; i++) {
			int sum = n1 + n2;
			n1 = n2;
			n2=sum;
			System.out.println(sum);

		}
	}

}
