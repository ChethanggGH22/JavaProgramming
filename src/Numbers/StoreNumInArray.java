package Numbers;

public class StoreNumInArray 
{
	public static void main(String[] args)
	{
		int no=126;
		int arr[]=new int[3];
		int index=arr.length-1;
		while(no!=0)
		{
			arr[index]=no%10;
			index--;
			no=no/10;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
