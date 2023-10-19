package com.ArraysEx;

public class FindMinmimumNum {
	public static void findMinimumNoOfArray() {
		int[] array = { 9, 2, 3, 4, 8 };

		int min = array[0]; // 9

		for (int i = 1; i < array.length; i++) {
//array[1]=2<9
			System.out.println(min + " ......array[i] " + array[i]);
			System.out.println("...................");
			if (array[i] < min) {

				min = array[i];

			}
			System.out.println(min + " ......array[i] " + array[i]);
		}
		System.out.println(min);

	}

	public static void main(String[] args) {
		findMinimumNoOfArray();
	}

	/// find dublicate no from array
}
