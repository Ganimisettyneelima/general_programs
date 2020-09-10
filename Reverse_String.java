package genaral_programs;
import java.util.Scanner;
public class Reverse_String
{ 

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String s2="";
		System.out.println("enter any String");
		String s1=in.next();
		for(int i=s1.length()-1;i>=0;i--)
		{
			//char c=s1.charAt(i);
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("reverse of the String is");
		System.out.println(s2);
		
	}

	

}
