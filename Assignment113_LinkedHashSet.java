package assignment111_120;

import java.util.Collections;
import java.util.LinkedHashSet;
/* Index- True
Dynamic- True
Heterogenous- True
Null- Only once
Duplicate- False
Sort- False    */
public class Assignment113_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(40);
		lh.add(null);
		lh.add("Ashwini");
		
		lh.add(640.98);
		lh.add("Java");
		lh.add('K');
		
		lh.add(90);
		lh.add(null);
		lh.add("Ashwini");
		
		lh.add(10);
		lh.add(null);
		lh.add("Ashwini");
		
		//Collections.sort(lh);
		
		System.out.println(lh);

	}

}
