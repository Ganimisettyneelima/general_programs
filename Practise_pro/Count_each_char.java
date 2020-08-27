package Practise_pro;
import java.util.Scanner;
public class Count_each_char
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter any String");
		String s1=in.nextLine();
		String s2=s1;
		
		for(int k=0;k<=s2.length()-1;k++)
		{ int count=0;
			char c2=s2.charAt(k);
			for(int i=0;i<=s1.length()-1;i++)
			{
				char c1=s1.charAt(i);
				if(c2==c1)
				{
					count++;
					
				}
			}
			int status=0;
			for(int l=k;l>=0;l--)
			{
				if(s2.charAt(l)== (s1.charAt(k)))
				{
					status++;
				}
			}
			if(count!=0&&status==1)
				
					System.out.println(s2.charAt(k)+"  count is "+count);
				
			}
			
			
		}
	}
