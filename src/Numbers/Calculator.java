package Numbers;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Take the input from user till user press x or X
		int ans=0;
		while(true)
		{
			System.out.print("Enter the first number");
			int num1=sc.nextInt();
			System.out.println("Enter the Operator");
			char ch=sc.next().trim().charAt(0);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
			{
				System.out.println("Enter the second number");
				int num2=sc.nextInt();
				if(ch=='+')
				{
					ans=num1+num2;
				}
				if(ch=='-')
				{
					ans=num1-num2;
				}
				if(ch=='*')
				{
					ans=num1*num2;
				}
				if(ch=='/')
				{
					if(num2!=0)
					{
						ans=num1/num2;
					}
				}
				if(ch=='%')
				{
					ans=num1%num2;
				}
			}
			else if(ch=='x' || ch=='X')
			{
				break;
			}
			else
			{
				System.out.println("Invalid Operator");
			}
			System.out.println(ans);
		}
	}
}

