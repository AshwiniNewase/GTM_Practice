package assignment91_100;

public class Assignment91 
{

	public static void main(String[] args) 
	{
		String name="manishtiwari";
		
		char nameC[]=name.toCharArray();
		
		for(int i=0; i<nameC.length;i++)
		{
			if(nameC[i]=='u')
			{
				System.out.println("yes, 'u' is present in given String at index "+i);
			}
		}
		
	}

}
