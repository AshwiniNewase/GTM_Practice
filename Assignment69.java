package Assignment61_70;

public class Assignment69 
{

	public static void main(String[] args) 
	{
		String name="Chhatrapati";
		String rev_name="";
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			rev_name=c+rev_name;
		}
		System.out.println("Given String in reversed manner: " +rev_name);

	}

}
