package Practise_pro;
import java.util.Scanner;
public class longest_Sub_string 
{
	public static void main(String[] args)
	{
		
		String s1="java developer html";
		
		int count=0;
		int i,j=0;
		String[] s=s1.split(" ");
		for(i=0;i<=s.length-1;i++)
		{
			String s2=s[i];
			if(count<s2.length())
			{
				count=s2.length();
				j=i;
			}
		}
		System.out.println(s[j]);
	}
	}
		
	
