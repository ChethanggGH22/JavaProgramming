package Arrays;

public class CountEvenOddByCallingMethod 
{
	public static void main(String[] args) 
	{
		int arr[]={2,3,4,54,5,2,4,43,9,8};
		int x=evencount(arr);
		int y=oddcount(arr);
		System.out.println("Even count is : "+x+"\nOdd count is : "+y);
	}
	static int evencount(int[] arr)
	{
		int ecount=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				ecount++;
			}
		}
		return ecount;
	}
	static int oddcount(int[] arr)
	{
		int ocount=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==1)
			{
				ocount++;
			}
		}
		return ocount;
	}
}
