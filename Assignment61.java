package Assignment61_70;

class super61
{
	private static void method1()
	{
		System.out.println("method with private access specifier");
	}
	static void method2()
	{
		System.out.println("method with default access specifier");
	}
	protected static void method3()
	{
		System.out.println("method with protected access specifier");
	}
	public static void method4()
	{
		System.out.println("method with public access specifier");
	}
}
public class Assignment61 extends super61
{
	private static void method5()
	{
		System.out.println("method with private access specifier");
	}
	static void method6()
	{
		System.out.println("method with default access specifier");
	}
	protected static void method7()
	{
		System.out.println("method with protected access specifier");
	}
	public static void method8()
	{
		System.out.println("method with public access specifier");
	}
	public static void main(String[] args) 
	{
		//method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
		method8();
	}
}
