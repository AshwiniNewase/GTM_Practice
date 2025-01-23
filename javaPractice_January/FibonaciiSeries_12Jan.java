package javaPractice_January;

import java.util.Scanner;

public class FibonaciiSeries_12Jan {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number upto which you want to calculate fibonacii series: ");
		int num=s1.nextInt();
		int sum=0;
		int b=1;
		int a=0;
		System.out.print("Fibonacii series is: 0 1");
		for(int i=1; i<=num; i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
		
	}

}
