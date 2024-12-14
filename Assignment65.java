package Assignment61_70;
interface super65
{
	void method1();
	void method2();
	void method3();
}
public class Assignment65 implements super65
{
	public static void main(String[] args) 
	{
		Assignment65 a1=new Assignment65();
		a1.method1();
		a1.method2();
		a1.method3();
	}
	@Override
	public void method1() 
	{
		System.out.println("overriden abstract method1");	
	}
	@Override
	public void method2() 
	{
		System.out.println("overriden abstract method2");	
	}
	@Override
	public void method3() 
	{
		System.out.println("overriden abstract method3");	
	}
}
