package Practise_pro;
import java .util.Scanner;
public class Ascii_values
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=in.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			int k=(int)c;
			System.out.println(k);
		}
		
	}

}
