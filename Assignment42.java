package assignment41_50;

import java.util.Scanner;

public class Assignment42 
{
	static void Area_Square(double side)
	{
		System.out.println("Area of the square: "+(side*side));
	}
	public static void main(String[] args) 
	{	
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter side of the sqaure: ");
	 	double side=s1.nextDouble();
	 	Area_Square(side);
	}

}
