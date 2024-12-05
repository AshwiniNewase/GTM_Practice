package assignment21_30;

public class Assignment26 
{
	static int num=10;
	String name="Java";
	static boolean b;
	
	void update_values(String name)
	{
		num=66;
		this.name=name;
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		int age=88;
		char c='K';
		double d=90.33;
		Assignment26 a1=new Assignment26();
		System.out.println(b);
		a1.update_values("Ruby");
		
		d=40.22;
		a1.name="Python";
		num=90;
		System.out.println(num);
		System.out.println(d);
		System.out.println(c);
		
	}

}
