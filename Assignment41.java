package assignment41_50;

import java.util.Scanner;

public class Assignment41 
{
	static void Area_Rectangle(double length, double width)
	{
		System.out.println("Area of the rectangle: "+(length*width));
	}
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter length of the rectangle: ");
		double length=s1.nextDouble();
		
		System.out.println("Enter width of the rectangle: ");
		double width=s1.nextDouble();
		
		Area_Rectangle(length, width);

	}

}
