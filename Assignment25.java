package assignment21_30;

public class Assignment25 
{
	Assignment25()
	{
		System.out.println("C1");
	}
	Assignment25(int a)
	{
		System.out.println("C2");
	}
	Assignment25(int a, int b)
	{
		System.out.println("C3");
	}
	
	static void add()
	{
		System.out.println("m1");
	}
	void add(int c)
	{
		System.out.println("m2");
	}
	void add(char b)
	{
		System.out.println("m3");
	}
	public static void main(String[] args) 
	{
		Assignment25 a1=new Assignment25();
		new Assignment25(10);
		new Assignment25(7,8);
		a1.add('k');
		add();
		a1.add(4);
	}
}
