package Assignment61_70;

import java.util.Scanner;

public class Assignment70 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter String: ");
		String name=s1.next();
		String rev_name="";
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			rev_name=c+rev_name;
		}
		System.out.println();
		if(name.equalsIgnoreCase(rev_name))
		{
			System.out.println("Given String is palindrome!");
		}
		else
			System.out.println("Given String is not palindrome!");
		}
}
