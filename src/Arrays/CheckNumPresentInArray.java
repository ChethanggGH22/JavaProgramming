package Arrays;

public class CheckNumPresentInArray //Linear Search program
{
	public static void main(String[] args)
	{
		int[] arr={1,10,2,4,4,10,10,7,19};
		for(int i=0; i<arr.length; i++ )
		{
			if(arr[i]==10)
			{
				if(i==2)
				{
					System.out.println("10 is present in "+i+"nd position");
				}
				else if(i==3)
				{
					System.out.println("10 is present in "+i+"rd position");
				}
				else if(i==1)
				{
					System.out.println("10 is present in "+i+"st position");
				}
				else
				{
					System.out.println("10 is present in "+i+"th position");
				}
				break; //Once the value is found break will end the for loop and terminate
			}
		}
	}
}
