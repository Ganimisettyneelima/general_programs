package Practise_pro;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter any String");
		String s1=in.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
		}
		if(s1.equals(s2))
		{
			System.out.println("given String is a palindrome");
		}
		else
		{
			System.out.println("string is not a palindrome");
		}
	}

}
