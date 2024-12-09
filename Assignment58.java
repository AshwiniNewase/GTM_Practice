package assignment51_60;
class super58
{
	void super58_method()
	{
		System.out.println("Super class implementation");
	}
}
public class Assignment58 extends super58
{
	void super58_method()
	{
		System.out.println("Sub class implementation");
		super.super58_method();
	}
	public static void main(String[] args) 
	{
		Assignment58 a1=new Assignment58();
		a1.super58_method();

	}

}
