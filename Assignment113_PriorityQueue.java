package assignment111_120;

import java.util.*;
/* Index- False
Dynamic- True
Heterogenous- False
Null- False
Duplicate- True
Sort- False    */
public class Assignment113_PriorityQueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Object> p1=new PriorityQueue<Object>();
		p1.add(40);
		
		p1.add(23);
		p1.add(40);
		p1.add(23);
		p1.add(40);
		p1.add(23);
		p1.add(10);
		p1.add(7);
		//p1.add(null);
		p1.add("Ashwini");
		//p1.add('J');
		//p1.add(87.45);
		//p1.add(true);
		//System.out.println("Before sorting: "+ p1);
		//Collections.sort(p1);
		System.out.println();
		System.out.println(p1);
		
	}

}
