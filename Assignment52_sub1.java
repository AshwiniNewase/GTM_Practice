package assignment51_60;
class super52
{
	static void super_method()
	{
		System.out.println("Hierarchical inheritence- super class static method");
	}
}
public class Assignment52_sub1 extends super52
{
	void sub1_method()
	{
		System.out.println("Hierarchical inheritence- sub1 class non static method");
	}
	public static void main(String[] args) 
	{
		Assignment52_sub1 a1=new Assignment52_sub1();
		a1.sub1_method();
		super_method();
	}

}
