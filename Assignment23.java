package assignment21_30;

public class Assignment23 
{
	void add()
	{
		System.out.println("M1");
	}
	void add(int a)
	{
		System.out.println("M2");
	}
	void add(int a, String b)
	{
		System.out.println("M3");
	}
	void add(char c)
	{
		System.out.println("M4");
	}
	public static void main(String[] args)
	{
		Assignment23 a1=new Assignment23();
		a1.add();
		a1.add('d');
		a1.add(80);
		a1.add(2, "Java");
	}
}
