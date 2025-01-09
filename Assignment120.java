package assignment111_120;

import java.util.HashMap;
import java.util.Map;

public class Assignment120 
{
	public static void main(String[] args) 
	{
		Map<Object, Object> m1=new HashMap<Object, Object>();
		m1.put(90, 21);
		m1.put("Python", 'C');
		m1.put(67.44, true);
		m1.put('J', 33.9);
		Map<Object, Object> m2=new HashMap<Object, Object>();
		m2.put("C Sharp", 21);
		m2.put("Python", 45.6);
		m2.put(6744, 'L');
		m2.put(false, 33);
		m1.putAll(m2);
		System.out.println();
		System.out.println(m1);
	}

}
