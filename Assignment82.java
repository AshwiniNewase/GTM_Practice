package Assignment81_90;

import java.util.Arrays;

public class Assignment82 
{

	public static void main(String[] args) 
	{
		int arr[]= {5,8,16,20,5};
		
		int rev_arr[]=new int[arr.length];
		
		int k=0;
		
		for(int i=arr.length-1; i>=0;i--)
		{
			rev_arr[k]=arr[i];
			k++;
		}
		System.out.println();
		System.out.println("Given array in reverse order: "+ Arrays.toString(rev_arr));

	}

}
