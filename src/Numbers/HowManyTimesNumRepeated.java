package Numbers;

//If you take the remainder of any number divide by 10, you are 
//going to get the last value
public class HowManyTimesNumRepeated 
{
	public static void main(String[] args) 
	{
		int no=13575767;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==7)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println("7 is repeated : "+count+" times");
	}
}
