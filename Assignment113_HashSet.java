package assignment111_120;

import java.util.Collections;
import java.util.HashSet;
/* Index- False
Dynamic- True
Heterogenous- True
Null- Only once
Duplicate- False
Sort- False    */
public class Assignment113_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		h1.add(40);
		h1.add(null);
		h1.add("Ashwini");
		h1.add(56.89);
		h1.add(30);
		h1.add(null);
		h1.add("Ashwini");
		
		h1.add(10);
		h1.add(null);
		h1.add("Ashwini");
		//Collections.sort(h1);
		
		System.out.println(h1);
	}

}
