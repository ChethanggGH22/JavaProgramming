package Arrays;

//target is 4 and find the previous of 4 is even or odd
public class CheckPreviousNumIsEven 
{
	public static void main(String[] args) 
	{
		int[] arr={5,6,7,4,43,8,4,34,5,6,5,76};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==4)
			{
				if(arr[i-1]%2==0)
				{
					System.out.println("Previous number of 4 is even");
				}
				else
				{
					System.out.println("Previous number of 4 is odd");
				}
				break;
			}
		}
	}
}
