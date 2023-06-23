package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] datas = { 23, 45, 67, 32, 89, 22 };
		int len = datas.length;
		Arrays.sort(datas);// {22,23,32,45,67,89}
		System.out.println(datas[1]);//method 1
		System.out.println(datas[len-5]);

	}

}
