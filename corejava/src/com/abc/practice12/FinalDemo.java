package com.abc.practice12;

final class FinalDemo //outer class cannot be static,classes can be public,final {
	void show()
	{
		System.out.println("Final class cannot be inherited");
	}

class Final3 extends FinalDemo//inheritance is not possible bcz of final class
{
	
}

}
