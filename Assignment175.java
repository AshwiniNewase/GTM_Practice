package testNG_Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* 	
Assignment 175
Create a class with 5 annotations
@BeforeMethod
@Test
@Test
@Test
@AfterMethod*/
public class Assignment175 
{
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("before method");
	}
	@Test
	public void testcase1()
	{
		System.out.println("test1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("test2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void afmethod()
	{
		System.out.println("after method");
	}
}
