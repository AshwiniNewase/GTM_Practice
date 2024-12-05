package assignment21_30;

public class Assignment22 
{
	Assignment22()
	{
		System.out.println("Non parameterised constructor");
	}
	Assignment22(int a, int b)
	{
		System.out.println("parameterised constructor1");
	}
	Assignment22(int a)
	{
		System.out.println("Non parameterised constructor2");
	}
	public static void main(String[] args) 
	{
		new Assignment22();
		new Assignment22(10);
		new Assignment22(20,30);
	}

}
