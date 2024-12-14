package Assignment61_70;
interface supermost67
{
	void method1();
	void method2();
}
interface super67
{
	void method3();
	void method4();
}
public class Assignment67 implements supermost67, super67
{
	public static void main(String[] args) 
	{
		Assignment67 a1=new Assignment67();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
	}
	@Override
	public void method3() 
	{
			System.out.println("overriden method3");
	}
	@Override
	public void method4() 
	{
		System.out.println("overriden method4");
	}
	@Override
	public void method1() 
	{
		System.out.println("overriden method1");
	}
	@Override
	public void method2() 
	{
		System.out.println("overriden method2");
	}
}
