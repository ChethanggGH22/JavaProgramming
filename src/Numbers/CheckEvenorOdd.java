package Numbers;

import java.util.Scanner;

public class CheckEvenorOdd 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
