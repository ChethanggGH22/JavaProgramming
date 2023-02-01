package Numbers;

public class FactorialOfGivenNumber 
{
	public static void main(String[] args) 
	{
		int Number=5;
		int fact=1;
		for(int i=Number; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
