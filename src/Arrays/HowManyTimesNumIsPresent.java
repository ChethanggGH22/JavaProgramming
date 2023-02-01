package Arrays;

public class HowManyTimesNumIsPresent 
{
	public static void main(String[] args)
	{
		int arr[]={2,3,4,1,5,3,5,3,1,5};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==5)
			{
				count++;
			}
		}
		System.out.println("5 is present "+count+" times");
	}
}
