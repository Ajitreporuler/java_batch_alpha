package com.ArraysEx;

import java.util.Arrays;

public class ReverseArray {
public static void reverseArray() {
	int[] array = { 9, 2, 3, 4, 8 };
	
	int[] revrArray=new int[array.length];
	
	for(int i=0;i<array.length;i++) {
		
		
		//i=1
		//rever[1]=array[5-1-1]=3
		//revr[1]=old[3]=4
		revrArray[i]=array[array.length-1-i];
	}
	
	
	
	
	
	
	
	
	
	System.out.println(Arrays.toString(array));
	
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	
	System.out.println( Arrays.toString(revrArray));
	
	
}
public static void main(String[] args) {
	reverseArray();
}
}
