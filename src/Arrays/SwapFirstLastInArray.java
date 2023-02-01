package Arrays;

public class SwapFirstLastInArray 
{
	public static void main(String[] args) 
	{
		int arr[]={12,23,4,5,6,9,27};
		System.out.println("Before Swapping");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		int a=arr[0];
		int b=arr[arr.length-1];
		a=a+b;
		b=a-b;
		a=a-b;
		arr[0]=a;
		arr[arr.length-1]=b;
		System.out.println("\nAfter Swapping");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
