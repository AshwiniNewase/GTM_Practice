package assignment21_30;

public class Assignment24 
{
	static void Method_overloading()
	{
		System.out.println("M1");
	}
	static void Method_overloading(int a)
	{
		System.out.println("M2");
	}
	static void Method_overloading(int a , int b)
	{
		System.out.println("M3");
	}
	static void Method_overloading(int b, char c)
	{
		System.out.println("M4");
	}
	static void Method_overloading(char d)
	{
		System.out.println("M5");
	}
	void Method_overloading(char a, int b)
	{
		System.out.println("M6");
	}
	void Method_overloading(String a)
	{
		System.out.println("M7");
	}
	void Method_overloading(boolean k)
	{
		System.out.println("M8");
	}
	void Method_overloading(char c, boolean b)
	{
		System.out.println("M9");
	}
	void Method_overloading(double d)
	{
		System.out.println("M10");
	}
	public static void main(String[] args) 
	{
		Assignment24 a1=new Assignment24();
		a1.Method_overloading(true);
		a1.Method_overloading(89.55);
		a1.Method_overloading("Java");
		a1.Method_overloading('g', false);
		a1.Method_overloading('f', 30);
		Method_overloading();
		Method_overloading(8);
		Method_overloading(6, 3);
		Method_overloading(89,'k');
		Method_overloading('l');

	}

}
