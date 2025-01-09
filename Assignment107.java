package assignment101_110;

import java.util.*;

public class Assignment107 
{

	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add("Selenium");
		s1.add("WebDriver");
		s1.add(900);
		s1.add(true);
		s1.add(90.33);
		
		System.out.println(s1);
		
		System.out.println();
		
		s1.removeAll(s1);
		
		System.out.println(s1);

	}

}
