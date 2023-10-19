package com.train.oops;

public class SampleCons {

	SampleCons(){
		 int i=10;
		System.out.println("default-count money");
		
	}
	SampleCons(int i1S ){
		 int i=10;
		System.out.println("count money");
		
	}
	SampleCons(int i1S, int j,int k ){
		 int i=10;
		System.out.println("three args---count money");
		
	}
	int i =10;
	
	public static void main(String[] args) {
		//SampleCons rf=new SampleCons();
		
		//SampleCons rf=new SampleCons(10);
		
		SampleCons rf=new SampleCons(10,10,10);
	}
}
