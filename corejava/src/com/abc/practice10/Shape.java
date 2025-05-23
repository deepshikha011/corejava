package com.abc.practice10;
public abstract class Shape {
	protected float area;
	abstract void calArea();//resuing same method in child class with different implementation
	void show()
	{
		System.out.println("The area is"+area);
	}

}
