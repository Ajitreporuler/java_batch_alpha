package com.javaStringExample;

import java.util.Arrays;

public class StringProgram1 {
public static void main(String[] args) {
	int i=0;
	i=10;

	String s="javadeveloper_from_bangalore";
	
	s="Ajit";

	int size=s.length();
	System.out.println(size+" size of the string");
	char ch=s.charAt(1);
	System.out.println(ch+" chat at index 1");
	
	int index=s.indexOf('a');
	System.out.println("first occurance of a is "+index);
	int lastIndex=s.lastIndexOf('a');
	System.out.println("last occurance of a is "+lastIndex);
	
	boolean qContains=s.contains("q");
	
	System.out.println("String contain q ? "+qContains);
	
	boolean doeasStartWithJ=	s.startsWith("j");
	System.out.println("doeasStartWithJ"+doeasStartWithJ);
	boolean doeasEndWithJ=	s.endsWith("j");
	System.out.println("doeasEndWithJ"+doeasEndWithJ);
	String string=s.substring(0, 4);
	System.out.println(string+" using substring");
	
	String[] str=s.split("_");
	
	
	
	System.out.println(s.indexOf('j'));
	
	System.out.println("split...... "+Arrays.toString(str));
	s.toUpperCase();
}
}
