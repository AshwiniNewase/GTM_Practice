package assignment101_110;
import java.util.ArrayList;
public class Assignment110 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add("Ashwini");
		l1.add('K');
		l1.add(50.90);
		l1.add(null);
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add("Ashwini");
		l2.add(20);
		l2.add(50.90);
		l2.add(null);
		l2.add('k');
		l1.addAll(l2);
		System.out.println(l1);
		l1.add(0, "Java");
		l2.addAll(0, l1);
		System.out.println(l1);
		System.out.println(l2);
		l1.clear();
		System.out.println(l2.isEmpty());
		System.out.println(l2.contains("Ashwini"));
		System.out.println(l2.containsAll(l1));
		System.out.println(l2.remove(1));
		System.out.println(l2.removeAll(l1));
		int size=l1.size();
		System.out.println("Array size: "+size);
			
	}

}
