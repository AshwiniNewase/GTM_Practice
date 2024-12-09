package assignment51_60;
class super55
{
	super55(int age)
	{
		System.out.println("Explicitly called Super class parameterised constructor");
	}
}
public class Assignment55 extends super55
{
	Assignment55()
	{
		super(45);
		System.out.println("Sub class constructor");
	}
	public static void main(String[] args) 
	{
		new Assignment55();
	}

}
