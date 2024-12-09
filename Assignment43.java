package assignment41_50;

import java.util.Scanner;

public class Assignment43 
{
	void Perimeter_Triangle(int side1, int side2, int side3)
	{
		System.out.println("Perimeter of triangle is: "+(side1+side2+side3));
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter side1 of triangle: ");
		int side1=s1.nextInt();
		System.out.println("Enter side2 of triangle: ");
		int side2=s1.nextInt();
		System.out.println("Enter side3 of triangle: ");
		int side3=s1.nextInt();
		Assignment43 a1=new Assignment43();
		a1.Perimeter_Triangle(side1, side2, side3);
	}

}
