package assignment41_50;

import java.util.Scanner;

public class Assignment45 
{
	static void perimeter_rect(int length, int width)
	{
		System.out.println("Perimeter of rectangle is: "+(2*(length+width)));
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		int length=s1.nextInt();
		System.out.println("Enter the width of the rectangle: ");
		int width=s1.nextInt();
		
		perimeter_rect(length, width);
		
	}

}
