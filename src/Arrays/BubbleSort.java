package Arrays;

//Basic BubbleSort program
public class BubbleSort 
{
	public static void main(String[] args)
	{
		int[] arr={32,43,45,2,4,6,7};
		for(int j=1; j<arr.length; j++) // Loop should be repeated length-1 number of times
		{
			for(int i=1; i<arr.length; i++) //This loop is for sorting
			{
				if(arr[i-1]>arr[i])
				{
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
