package assignments10_20;

import java.util.Scanner;

public class Assignment6 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		//System.out.println("Enter age: ");
		int age=10;
		
		//System.out.println("Enter gender: ");
		String gender="girl";
		
		if((age<15) && (gender=="girl"))
		{
			System.out.println("I go to the girls school.");
		}
		if((age<15) && (gender=="boy"))
		{
			System.out.println("I go to the boys school.");
		}

	}

}
