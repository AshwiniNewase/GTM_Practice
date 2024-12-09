package assignment41_50;

class super49
{
	void superClass_method()
	{
		System.out.println("Super Class mehtod- single level inheritence");
	}
}

public class Assignment49 extends super49
{
	void subClass_method()
	{
		System.out.println("Sub Class mehtod- single level inheritence");
	}
	public static void main(String[] args) 
	{
		Assignment49 a1=new Assignment49();
		a1.superClass_method();
		a1.subClass_method();
	}

}
