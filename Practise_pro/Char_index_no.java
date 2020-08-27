package Practise_pro;
import java.util.Scanner;
public class Char_index_no 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=in.next();
		System.out.println("enter any character");
		char c=in.next().charAt(0);
		System.out.println("enter the index number ");
		int n=in.nextInt();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(n==i)
			{
			System.out.println("char in index no "+n+" is present in given String");
			}
			
		}
		
		
	}

}
