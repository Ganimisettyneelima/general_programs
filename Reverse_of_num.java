package genaral_programs;
import java.util.Scanner;
public class Reverse_of_num 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int reverse=0;
		int num1=in.nextInt();
		//int num1=43857;
		while(num1!=0)
		{
			int r=num1%10;
			reverse=reverse*10+r;
			num1=num1/10;
			
		}
		System.out.println("reverse of the given number");
		System.out.println(reverse);
		
	}

}
