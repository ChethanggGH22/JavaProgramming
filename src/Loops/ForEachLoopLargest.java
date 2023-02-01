package Loops;

public class ForEachLoopLargest 
{
	public static void main(String[] args) 
	{
		int arr[]={52,34,3,53,5,76,423,868};
		int largest=arr[5]; //we can specify any index in this
		for(int lar : arr)  //for each loop will check from first index to last index
		{
			if(lar>largest)
				largest=lar;
		}
		System.out.println(largest);
	}
}
