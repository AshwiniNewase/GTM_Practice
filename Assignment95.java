package assignment91_100;

public class Assignment95 
{

	public static void main(String[] args) 
	{
		String name="ManishKumarTiwari";
		
		String name1=name.replaceAll("[a-z]", "");
		
		//System.out.println(name1);
		
		char charC[]=name1.toCharArray();
		
		for(int i=0; i<charC.length;i++)
		{
			System.out.println(charC[i]);
			
		}

	}

}
