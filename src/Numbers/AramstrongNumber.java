package Numbers;
/*Example num =153
 * Expand the numbers and take cube of each digit
 * --> 1*1*1  5*5*5   3*3*3  
 *       1      125     27
 *     Now Add those numbers
 *         1 + 125 + 27 
 *             = 153
 *     If the answer is equal to given number
 *   Then that number is Armstrong number*/
public class AramstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=153;
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}
}
