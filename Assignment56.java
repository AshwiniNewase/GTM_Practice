package assignment51_60;
class supermost56
{
	supermost56(String name)
	{
		System.out.println("Supermost class parameterised constructor");
	}
}
class super56 extends supermost56
{
	super56(String name, int age)
	{
		super("India");
		System.out.println("Super class parameterised constructor");
	}
}
public class Assignment56 extends super56
{
	Assignment56()
	{
		super("Ashwini", 88);
		System.out.println("Sub class constructor");
	}
	public static void main(String[] args) 
	{
		new Assignment56();
	}
}
