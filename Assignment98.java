package assignment91_100;

import java.util.Date;

public class Assignment98 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		//System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		
		System.out.println();
		System.out.println("Current date & time: "+ d2);
		
		System.out.println();
		
		Date d3=new Date(d1.getTime()-(1000*60*60*24));
		System.out.println("Past date & time: "+ d3);
		
		System.out.println();
		Date d4=new Date(d1.getTime()+(1000*60*60*24));
		System.out.println("Future date & time: "+ d4);

	}

}
