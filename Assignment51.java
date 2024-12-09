package assignment51_60;
class supermost51Class
{
	void supermost_method()
	{
		System.out.println("Multilevel inheritence- Supermost class non static method");
	}
}
class super51Class extends supermost51Class
{
	void super_method()
	{
		System.out.println("Multilevel inheritence- Super class non static method");
	}
}
public class Assignment51 extends super51Class
{
	static void sub_method()
	{
		System.out.println("Multilevel inheritence- Sub class static method");
	}
	public static void main(String[] args) 
	{
		Assignment51 a1=new Assignment51();
		sub_method();
		a1.super_method();
		a1.supermost_method();
	}
}
