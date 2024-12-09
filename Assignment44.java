package assignment41_50;

import java.util.Scanner;

public class Assignment44 
{
	static void Circumference_Circle(int radius, double pi)
	{
		System.out.println("Circumference of Circle: "+(2* pi* radius));
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int radius=s1.nextInt();
		double pi=Math.PI;
		
		Circumference_Circle(radius, pi);
	}

}
