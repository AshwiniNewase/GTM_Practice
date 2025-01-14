package testNG_Assignment;

import org.testng.annotations.Test;

/*Assignment 178
Create a class with 3 @test annotation which contains 3 method 
Set priory to individual methods
1:Registration as priority 1
2:login as priority 2
3:logout as priority 3*/
public class Assignment178 
{
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=1)
	public void signin()
	{
		System.out.println("signin");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout");
	}
	
}
