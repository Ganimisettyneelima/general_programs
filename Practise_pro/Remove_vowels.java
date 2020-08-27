package Practise_pro;
import java.util.Scanner;
public class Remove_vowels
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter any String");
		String s1=in.next();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&   c!='u')
			{
				int k=s2.indexOf(c);
				if(k==-1)
				{
					s2=s2+c;
				}
				
			}
		}
		System.out.println("given String "+s1);
		System.out.println("after removing vowels "+s2);
	}

}
