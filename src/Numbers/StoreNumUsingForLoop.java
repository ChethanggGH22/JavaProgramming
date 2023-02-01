package Numbers;

import java.util.Arrays;

public class StoreNumUsingForLoop 
{
	public static void main(String[] args) 
	{
		int no=125;
		int[] arr=new int[3];
		for(int index=arr.length-1; no!=0; index--)
		{
			arr[index]=no%10;
			no=no/10;
		}
		System.out.println(Arrays.toString(arr));
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
	}
}
