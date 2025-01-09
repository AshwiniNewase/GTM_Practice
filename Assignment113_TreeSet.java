package assignment111_120;

import java.util.*;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* Index- False
Dynamic- True
Heterogenous- False
Null- False
Duplicate- False
Sort- False    */

public class Assignment113_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Object> t1=new TreeSet<Object>();
		//Set s1= (Set) t1;
		t1.add(44);
		t1.add(44);
		t1.add(40);
		t1.add(88);
		t1.add(40);
		
		//t1.add(44);
		//t1.add(44);
	
		//t1.add(null);
		t1.add("Ashwini");
		
		t1.add(99);
		t1.add(45);
		
		t1.add(70);
		t1.add(70);
		System.out.println();
		System.out.println(t1);
		//Collections.sort(t1);

	}

}
