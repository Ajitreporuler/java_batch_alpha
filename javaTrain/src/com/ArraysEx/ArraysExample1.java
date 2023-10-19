package com.ArraysEx;

import java.util.Iterator;

public class ArraysExample1 {
	
	
	public static void printArrayElement(int[] array) {
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}
public static void main(String[] args) {
	int[] array=new int[5];
	array[0]=1;
	array[1]=2;
	
	array[2]=3;
	array[4]=6;
							
	printArrayElement(array);
}
}
