package Numbers;

import java.util.Scanner;

public class FibonacciSeriesWhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int count=0;
		while(count<n)
		{
			int temp=b;
			b=a+b;
			a=temp;
			count++;
			System.out.println(b);
		}
	}
}
