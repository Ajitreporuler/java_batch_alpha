package com.javaStringExample;

public class RemoveDuplicate {
public static void removeDuplicate(String str) {
	//String newString="";
	StringBuilder newString=new StringBuilder();
for(int i=0;i<str.length();i++) {
	
	if(newString.indexOf(String.valueOf(str.charAt(i)))==-1) {
	
	newString.append(str.charAt(i));
	}else {
		System.out.println(str.charAt(i));
	}
	
	
	
}

System.out.println(newString);
}







public static void main(String[] args) {
	removeDuplicate("java");
}
}
