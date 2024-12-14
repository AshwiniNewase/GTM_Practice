package Assignment61_70;

public class Assignment68 
{
	public static void main(String[] args) 
	{
		String name="   Shree Swami Samarth  ";
		String name1="shree swami samarth";
		System.out.println("Length of the String: "+name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println("Character at index 5: "+name.charAt(5));
		System.out.println("Index of character S: "+name.indexOf('S'));
		System.out.println(name.substring(9));
		System.out.println(name.substring(9, 14));
		System.out.println(name1.contains("swami"));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));	
	}

}
