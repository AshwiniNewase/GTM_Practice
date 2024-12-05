package assignment21_30;

public class Assignment21 
{
	static void add(int a)
	{
		System.out.println("I am static method1");
	}
	static void sub(String a)
	{
		System.out.println("I am static method2");
	}
	void add(int a, char c)
	{
		System.out.println("I am non static method1");
	}
	Assignment21(int a)
	{
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) 
	{
		Assignment21 a1=new Assignment21(10);
		add(20);
		sub("Ashwini");
	}

}
