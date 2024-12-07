package assignment31_40;

import java.util.Scanner;

public class Assignment37 
{
	static void addition(int num1, int num2)
	{
		System.out.println("Addition is: "+ (num1+num2));
	}
	static void subtraction(int num1, int num2)
	{
		System.out.println("Subtraction is: "+ (num1-num2));
	}
	static void multiplication(int num1, int num2)
	{
		System.out.println("Multiplication is: "+ (num1*num2));
	}
	static void division(int num1, int num2)
	{
		System.out.println("Division is: "+ (num1/num2));
	}
	static void modulus(int num1, int num2)
	{
		System.out.println("Modulus is: "+ (num1%num2));
	}

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=s1.nextInt();
		System.out.println("Enter num2: ");
		int num2=s1.nextInt();
		addition(num1, num2);
		subtraction(num1, num2);
		multiplication(num1, num2);
		division(num1,num2);
		modulus(num1, num2);
	}

}
