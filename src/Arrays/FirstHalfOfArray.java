package Arrays;

public class FirstHalfOfArray 
{
	public static void main(String[] args) 
	{
		int arr[]={3,43,2,14,43,454,54,5};
		for(int i=0; i<arr.length/2; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Second half of the array
		for(int i=arr.length/2; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
