package Numbers;

public class SumOfCubeOfEachDigit 
{
	public static void main(String[] args) 
	{
		int num=1267;
		int sum=0;
		if(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		System.out.println(sum);
	}
}
