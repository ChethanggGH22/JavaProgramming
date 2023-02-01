package Numbers;

import java.util.Scanner;

public class Calculator1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Take the input from user till user press x or X
		int ans=0;
		while(true)
		{
			System.out.println("Enter the operator: ");
			char ch=sc.next().trim().charAt(0);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
			{
				//input two numbers
				System.out.println("Enter two numbers: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
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
