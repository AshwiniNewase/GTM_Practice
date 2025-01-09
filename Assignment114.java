package assignment111_120;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment114 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(1000);
		a1.add(200);
		a1.add(30);
		a1.add(10);
		a1.add(5);
		System.out.println();
		System.out.println("Before sorting: "+ a1);
		Collections.sort(a1);
		System.out.println();
		System.out.println("After sorting: "+ a1);
	}

}
