package assignment31_40;

import java.util.Scanner;

public class Assignment39
{
	static void Area_Triangle(double height, double width)
	{
		System.out.println("Area of the Triangle is: "+(0.5*height*width));
	}
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter height of the triangle: ");
		double height=s1.nextDouble();
		
		System.out.println("Enter width of the triangle: ");
		double width=s1.nextDouble();
		
		Area_Triangle(height, width);
	}
}
