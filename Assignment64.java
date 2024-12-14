package Assignment61_70;
abstract class super64
{
	abstract void method1();
	abstract void method2();
	void method3()
	{
		System.out.println("non static method in abstract class");
	}
	static void method4()
	{
		System.out.println("static method in abstract class");
	}
}
public class Assignment64 extends super64
{
	public static void main(String[] args) 
	{
		Assignment64 a1=new Assignment64();
		a1.method1();
		a1.method2();
		a1.method3();
		method4();
	}
	@Override
	void method1()
	{	
		System.out.println("overriden abstract method1");
	}
	@Override
	void method2()
	{
		System.out.println("overriden abstract method2");
	}
	void method3()
	{
		System.out.println("overriden non static method3");
	}
	static void method4()
	{
		System.out.println("overriden static method4");
	}
}
