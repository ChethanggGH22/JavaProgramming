package Arrays;

public class PrintPreviousNum 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,44,3,54,546,2,5,6};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==2)
			{
				System.out.println(arr[i-1]);
			}
		}
	}
}
