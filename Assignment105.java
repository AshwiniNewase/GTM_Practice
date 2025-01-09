package assignment101_110;

import java.util.*;

public class Assignment105 
{

	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add("Selenium");
		s1.add("WebDriver");
		s1.add(900);
		s1.add(true);
		s1.add(90.33);
		
		Set s2=new HashSet();
		s2.add("Selenium");
		s2.add("WebDriver");
		s2.add(900);
		s2.add(true);
		s2.add(90.33);
		
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		System.out.println(s1.containsAll(s2));

	}

}
