package Loops;
//Find smallest number in the array by using for each loop

public class ForEachLoopSmallest 
{
	public static void main(String[] args) 
	{	
		int arr[]={2,4,5,2,5,76,8};
		int smallest=arr[0];
		for(int a : arr)
		{
			if(a<smallest)
			smallest=a;
		}
	System.out.println(smallest);
	}
}
