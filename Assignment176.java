package testNG_Assignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Assignment 176
Create a class with 4 annotations
@BeforeMethod
@Test
@Test
@Test
*/
public class Assignment176 
{
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("before method");
	}
	@Test
	public void testcase1()
	{
		System.out.println("test 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("test 2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("test 3");
	}
}
