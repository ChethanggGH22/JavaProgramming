package Numbers;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // This n means how many fibonacci numbers we want
		int fib1=0;
		int fib2=1;
		System.out.print(fib1+" "+fib2);
		for(int i=1; i<n; i++)
		{
			int fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(" "+fib3);
		}
	}
}
