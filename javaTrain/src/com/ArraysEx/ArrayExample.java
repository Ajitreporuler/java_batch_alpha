package com.ArraysEx;

public class ArrayExample {
	public static void manipulateArray(int[] array) {
		int value = 0;
		for (int i = 0; i<array.length; i++) {
//array[1]
			//array[2] array[3] array[4],array[5] 
			value = value + array[i];
		}
		System.out.println(value);

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 0, 6 };
		manipulateArray(array);
	}
}
