package Numbers;

public class CountDigitsInNumber 
{
	public static void main(String[] args)
	{
		int no=126;
		int count=0;
		while(no!=0)
		{
			count++;
			no=no/10; //this will remove one digit from that number
		}  // means divide symbol will fetch the quotient and store it in no
		System.out.println(count);
	}
}
