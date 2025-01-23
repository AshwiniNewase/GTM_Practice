package javaPractice_January;

import java.util.Scanner;

public class PrimeNumber_10Jan 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number upto which you want to calculate prime number: ");
		int num=s1.nextInt();
		int count=0;
		System.out.println("Prime numbers: ");
		for(int i=2;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
			

	}

}
