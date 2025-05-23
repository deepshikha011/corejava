package com.abc.practice12;

public class FinalVariable {//final variable should be initialized
	final int x=100;
	final static int y;//declared blank  initialized not needed in static
	final static int z=10;//initialization needed bcoz of final
	
	
	void change()//cannot make changes bcoz of final even for only declared variable
	{
		x=30;
		y=100;
	}


	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ",y"+y+"]";
	}
	
	//Declare a static block to initialize the final static variable
	static {
		y=20;//blank declaration can be initialized 
		z=100;
		System.out.println("Value of Y:"+y);
	}
}
