package assignment51_60;
class super54
{
	super54()
	{
		System.out.println("Explicitly called Super class constructor");
	}
}
public class Assignment54 extends super54
{
	Assignment54()
	{
		super();
		System.out.println("Sub class constructor");
	}
	public static void main(String[] args) 
	{
		new Assignment54();
	}
}
