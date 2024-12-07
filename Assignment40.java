package assignment31_40;

import java.util.Scanner;

public class Assignment40 
{
	void Area_Circle(double pi, double radius)
	{
		System.out.println("Area of the Circle: "+ (pi*radius*radius));
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		double radius=s1.nextDouble();
		double pi=Math.PI;
		
		Assignment40 a1=new Assignment40();
		a1.Area_Circle(pi, radius);
	}

}
