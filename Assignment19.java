package assignments10_20;

public class Assignment19 
{

	void add(int b)
	{
		System.out.println("Non static add method");
	}
	void sub(String a)
	{
		System.out.println("Non static sub method");
	}
	public static void main(String[] args) 
	{
		Assignment19 a1= new Assignment19();
		a1.add(10);
		a1.sub("Ram");

	}

}
