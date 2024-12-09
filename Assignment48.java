package assignment41_50;
class superClass
{
	static void superClass_method()
	{
		System.out.println("Single level inheritence- Super class method");
	}
	
}
public class Assignment48 extends superClass
{

	static void subClass_method()
	{
		System.out.println("Single level inheritence- Sub class method");
	}
	public static void main(String[] args) 
	{
		subClass_method();
		superClass_method();
	}

}
