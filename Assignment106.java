package assignment101_110;

import java.util.List;
import java.util.Vector;

public class Assignment106 
{

	public static void main(String[] args) 
	{
		List l1=new Vector();
		
		l1.add("Selenium");
		l1.add('A');
		l1.add(80.5);
		l1.add(null);
		l1.add(true);
		
		System.out.println(l1);
		
		l1.remove(3);
		
		System.out.println();
		
		System.out.println(l1);

	}

}
