package week1.day2;

public class PosConversion {

	public static void main(String[] args) {
		/*
		 * Problem statement: Convert a negative number to positive number Pseudocode:
		 * 1. Initialize an integer with a negative number like, int number = -40;
		 * 2.Check if the number is a negative number Hint : any number that is lesser
		 * than zero is a negative number 3.If so, convert the number to a positive
		 * numer 4. Print as below "The number -40 is converted to 40"
		 */
		int num = -40;
	
		if (num < 0)
		System.out.println(+num - num - num);// 1st methode
		System.out.println(Math.abs(num));// 2nd methode
	}

}
