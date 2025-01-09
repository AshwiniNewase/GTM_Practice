package assignment111_120;
import java.util.*;
public class Assignment111 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Java");
		a1.add(40);
		a1.add("Selenium");
		a1.add(89.83);
		a1.add(null);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println();
		ListIterator l1=a1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println();
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}

	}

}
