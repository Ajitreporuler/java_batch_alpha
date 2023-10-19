package com.javaStringExample;

public class findVowelAndConst {
	
	public static void findVowel(String strArg) {
		System.out.println(strArg);
		String str = strArg.toLowerCase();

		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < str.length(); i++) {

			// i=0
			// j=0,1,2,3,4
			// i=1
			// j=0,1,2,3,4

			/*
			 * for (int j = 0; j < vowel.length; j++) { if (str.charAt(i) == vowel[j]) {
			 * 
			 * }
			 * 
			 * }
			 */

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.println(str.charAt(i));
			} else {
				System.out.println(str.charAt(i) + " cons.......");
			}

		}

	}

	public static void main(String[] args) {
		findVowel("Ajitkumar");
	}
}
