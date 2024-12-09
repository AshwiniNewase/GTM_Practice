package assignment51_60;

public class Assignment59 
{
	int age=30;
	
	void update_age(int age)
	{
		this.age=age;
		System.out.println(age);
		System.out.println(this.age);
	}
	public static void main(String[] args) 
	{
		int age=90;
		System.out.println(age);
		age=55;
		Assignment59 a1=new Assignment59();
		a1.update_age(35);
		System.out.println(age);
	}
}
