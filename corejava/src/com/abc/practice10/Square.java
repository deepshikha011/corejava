package com.abc.practice10;

public class Square extends Shape
{
	private float side;
	public Square()
	{
		this.side=2.0f;
	}
	@Override
	void calArea() {
		area=side*side;
		
	}
	

}
