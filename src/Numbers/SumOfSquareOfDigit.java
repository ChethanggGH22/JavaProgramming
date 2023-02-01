package Numbers;

public class SumOfSquareOfDigit 
{
	public static void main(String[] args) 
	{
		int no=1267;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		System.out.println(sum);
	}
}
