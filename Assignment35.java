package assignment31_40;

public class Assignment35 
{
	public static void main(String[] args) 
	{
		int number1=40;
		int number2=20;
		
		System.out.println("Addition is: "+ (Math.addExact(number1, number2)));
		System.out.println("Subtraction is: "+(Math.subtractExact(number1, number2)));
		System.out.println("Multiplication is: "+ (Math.multiplyExact(number1, number2)));
		System.out.println("Division is: "+(Math.floorDiv(number1, number2)));
	}

}
