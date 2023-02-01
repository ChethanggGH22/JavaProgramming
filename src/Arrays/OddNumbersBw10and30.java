package Arrays;

public class OddNumbersBw10and30 
{
	public static void main(String[] args)
	{
		int arr[]={2,3,4,12,13,5,4,65,63,35,6,7,3,5};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>=10 && arr[i]<=30 && arr[i]%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
