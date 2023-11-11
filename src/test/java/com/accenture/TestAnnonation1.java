package com.accenture;

import org.testng.annotations.Test;

public class TestAnnonation1 {

	@Test  //   define annonation before method   or Test method or Test annontatin method or Test case
	public void testA() // normal java method
	{
		System.out.println("stmt-1 from test A()");
		System.out.println("stmt-2 from testA()");
	}
	
	@Test  //   define annonation before method   or Test method or Test annontatin method or Test case
	public void testA2() // normal java method
	{
		System.out.println("stmt-1 from test A2()");
		System.out.println("stmt-2 from testA2()");
	}
	

}

