package Arrays;

public class CountLessThanNumAndOdd 
{
	public static void main(String[] args)
	{
		int arr[]={3,4,2,4,5,23,343,435,53,54};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<10 && arr[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println("count of number which is less than 10 and odd is "+count);
	}
}
