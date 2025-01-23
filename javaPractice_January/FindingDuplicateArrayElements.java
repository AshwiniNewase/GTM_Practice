package javaPractice_January;

public class FindingDuplicateArrayElements
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2, 3, 5,6, 2,4 ,3, 2};
		System.out.println("Duplicates: ");
		
		for (int i = 0; i < arr.length; i++) 
		{
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
	}

}
