package assignment111_120;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment115 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String> ();
		
		a1.add("Java");
		a1.add("C Sharp");
		a1.add("Ruby");
		a1.add("Python");
		System.out.println();
		System.out.println(a1);
		System.out.println();
		Collections.sort(a1);
		System.out.println(a1);
	}

}
