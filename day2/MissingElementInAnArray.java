package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// Here is the input
		// Sort the array
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		
		int[] arry = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arry);

		for (int i = 0; i < arry.length; i++) {
			int temp = i + 1;

			if (arry[i] != temp) {

				System.out.println(temp);

				break;
			}
		}

	}

}
