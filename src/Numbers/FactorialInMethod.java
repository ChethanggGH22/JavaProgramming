package Numbers;

public class FactorialInMethod 
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}
	static int factorial(int N)
	{
		int fact=1;
		for(int i=N; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
