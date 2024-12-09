package assignment41_50;

import java.util.Scanner;

public class Assignment46
{
	static void perimeter_square(int side)
	{
		System.out.println("Perimeter of the square is: "+(4*side));
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter side of the square: ");
		int side=s1.nextInt();
		
		perimeter_square(side);
	}

}
