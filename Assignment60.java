package assignment51_60;

public class Assignment60 
{
	public static void method1()
	{
		System.out.println("Method with public access specifier ");
	}
	static void method2()
	{
		System.out.println("Method with default access specifier ");
	}
	private static void method3()
	{
		System.out.println("Method with private access specifier ");
	}
	protected static void method4()
	{
		System.out.println("Method with protected access specifier ");
	}
	public static void main(String[] args) 
	{
		method1();
		method2();
		method3();
		method4();
	}
}
