package genaral_programs;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter any number");
		int n1=in.nextInt();
		int n2;
		n2=n1;
		int reverse=0;
		
		while(n1!=0)
		{
			int r= n1%10;
			reverse=reverse*10+r;
			n1=n1/10;
		}
		if(reverse==n2)
		{
			System.out.println("given num is palindrome"+ reverse);
		}
		else 
		{
			System.out.println("given number is not a palindrome");
		}
		
		
	}

}
