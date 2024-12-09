package assignment41_50;
class super50
{
	static void superClass_method()
	{
		System.out.println("Super Class static mehtod- single level inheritence");
	}
}
public class Assignment50 extends super50
{
	void subClass_method()
	{
		System.out.println("Sub Class non static mehtod- single level inheritence");
	}
	public static void main(String[] args) 
	{
		Assignment50 a1=new Assignment50();
		superClass_method();
		a1.subClass_method();

	}

}
