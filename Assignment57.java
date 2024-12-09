package assignment51_60;

public class Assignment57 
{
	Assignment57(int a)
	{
		this();
		System.out.println("C1");
	}
	Assignment57(String b)
	{
		this('n');
		System.out.println("C2");
	}
	Assignment57(int d, int c)
	{
		this(4);
		System.out.println("C3");
	}
	Assignment57(char g)
	{
		this(7,9);
		System.out.println("C4");
	}
	Assignment57()
	{
		System.out.println("C5");
	}
	public static void main(String[] args) 
	{
		new Assignment57("abc");
		
	}

}
