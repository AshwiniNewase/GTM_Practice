package testNG_Assignment;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*  	
Assignment 177
Create a class with 4 annotations
@BeforeSuite
@Test
@Test
@Test
*/
public class Assignment177 
{

	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("before suite");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
}
