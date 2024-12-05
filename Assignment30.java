package assignment21_30;

public class Assignment30 
{

	public static void main(String[] args) throws InterruptedException 
	{
		int age=10;
		String str="Ashwini";
		String str_rev="";
		System.out.println(age);
		for(int i=0;i<str.length();i++)
		{
			char char1=str.charAt(i);
			str_rev=char1+str_rev;
		}
		Thread.sleep(3000);
		System.out.println(str_rev);
	}
}
