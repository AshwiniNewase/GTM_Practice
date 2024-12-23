package Assignment81_90;

import java.util.Arrays;

public class Assignment81 
{
	public static void main(String[] args) 
	{
		int arr[]= {5,8,16,20,5};
		
		int sum=0;
		
		double avg=0;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i< arr.length;i++)
		{
			sum=arr[i]+sum;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();
		System.out.println("Average of array elements: "+ (avg=sum/arr.length));
				
	}
}
