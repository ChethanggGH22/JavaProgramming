package Arrays;

public class CountDigitsInNumber 
{
	public static void main(String[] args)
	{
		int arr[]={2,43,543,5,343,5,45,546,453};
		int singledigit=0;
		int doubledigit=0;
		int threedigit=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0 && arr[i]<10)
			{
				singledigit++;
			}
			else if(arr[i]>9 && arr[i]<100)
			{
				doubledigit++;
			}
			else if(arr[i]>99 && arr[i]<1000)
			{
				threedigit++;
			}
		}
		System.out.println(singledigit+" Single digit numbers present in array");
		System.out.println(doubledigit+" Double digit numbers present in array");
		System.out.println(threedigit+" Three digit numbers present in array");
	}
}
