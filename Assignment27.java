package assignment21_30;

public class Assignment27 
{
	static int a;
	static int b;
	
	 static void addition(int a, int b)
	 	{
		 	System.out.println("Addition: " +(a+b));
	 	}
	 static void subtraction(int a, int b)
		{
		 System.out.println("Subtraction: " +(a-b));
		}
	 static void multiplication(int a, int b)
		{
		 System.out.println("Multiplication: " +(a*b));
		}
	 static void division(int a, int b)
		{
		 System.out.println("Division: " +(a/b));
		}
	 static void modulus(int a, int b)
		{
		 System.out.println("Modulus: " +(a%b));
		}
	public static void main(String[] args) 
	{
		addition(10,20);
		subtraction(30,5);
		multiplication(5,9);
		division(35,8);
		modulus(21,5);
	}

}
