package assignment101_110;

import java.util.ArrayList;
import java.util.List;

public class Assignment102 
{

	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		l1.add("Selenium");
		l1.add('A');
		l1.add(80.5);
		l1.add(null);
		l1.add(true);
		
		System.out.println(l1);
		System.out.println();
		
		l1.add(2, "WebDriver");
		System.out.println(l1);
		System.out.println();
		
		l1.addAll(l1);
		System.out.println(l1);
		System.out.println();
		
		l1.addAll(2, l1);
		System.out.println(l1);
		System.out.println();
		
		l1.clear();
		System.out.println(l1);

	}

}
