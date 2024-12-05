package assignments10_20;

public class Assignment18 
{

	void add()
	{
		System.out.println("Non static add method");
	}
	void sub()
	{
		System.out.println("Non static sub method");
	}
	public static void main(String[] args) 
	{
		Assignment18 a1= new Assignment18();
		a1.add();a1.sub();

	}

}
