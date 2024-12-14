package Assignment61_70;
interface supermost66
{
	void method1();
}
abstract class super66 implements supermost66
{
	abstract void method2();
	void method3()
	{
		System.out.println("non static abstract method3");
	}
}
public class Assignment66 extends super66
{
	public static void main(String[] args) 
	{
		Assignment66 a1=new Assignment66();
		a1.method1();
		a1.method2();
		a1.method3();
	}
	@Override
	public void method1() 
	{
		System.out.println("overriden method1 from interface");
	}
	@Override
	void method2() 
	{
		System.out.println("overriden method1 from abstract class");
	}

}
