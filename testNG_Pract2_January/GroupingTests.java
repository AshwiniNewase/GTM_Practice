package testNG_Pract2_January;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingTests 
{

	@Test(groups= {"smoke"})
	public void tc1()
	{
		System.out.println("tc1");
	}
	@Test(groups= {"smoke","system"})
	public void tc2()
	{
		System.out.println("tc2");
	}
	@Test(groups= {"system"})
	public void tc3()
	{
		System.out.println("tc3");
	}
	@Test(groups= {"system"})
	public void tc4()
	{
		System.out.println("tc4");
	}
}
