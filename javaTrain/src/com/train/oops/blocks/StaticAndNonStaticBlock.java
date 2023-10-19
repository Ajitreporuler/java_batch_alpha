package com.train.oops.blocks;

public class StaticAndNonStaticBlock {

	
	
	
	
	{
		int j=10;
		 final  int i=10;
		System.out.println("printing non-static block");
	}
	
	
static {
		
		int i=10;
		System.out.println("printing static block");
	}
	
	
	public static void main(String[] args) {
		StaticAndNonStaticBlock rf=new StaticAndNonStaticBlock();
	}
}
