package com.abc.practice12;

public class FinalMethodClass {
	
	FinalMethodClass()
	{
		System.out.println("this is a Default Constructor");
	}
	
	
	final int a=10;
	final void show()//if i remove final overridden can be done
	{
		System.out.println("the value of a:"+a);
	}

}
