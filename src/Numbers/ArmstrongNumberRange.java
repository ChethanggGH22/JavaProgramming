package Numbers;

public class ArmstrongNumberRange 
{
	public static void main(String[] args)
	{
		for(int i=100; i<=999; i++)
		{
			int num=i;
			int sum=0;
			int copy=num;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
			if(sum==copy)
			{
				System.out.println(copy+" is Armstrong number");
			}
		}
	}
}
