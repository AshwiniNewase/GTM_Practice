package assignment111_120;

import java.util.ArrayList;
import java.util.Collections;
/* Index- True
Dynamic- True
Heterogenous- True
Null- True
Duplicate- True
Sort- True    */
public class Assignment113_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add(90);
		a1.add(null);
		a1.add("Ashwini");
		
		a1.add(40);
		a1.add(null);
		a1.add("Ashwini");
		
		a1.add(10);
		a1.add(null);
		a1.add("Ashwini");
		//Collections.sort(a1);
		System.out.println();
		System.out.println(a1);
		
	}

}
