package Practise_pro;
import java.util.Scanner;
public class remove_duplicates
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	System.out.println("enter any string");
	String s1=in.next();
	String s2="";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char c=s1.charAt(i);
		int k=s2.indexOf(c);
		if(k==-1)
		{
			s2=s2+c;
		}
		
	}
	System.out.println(s1);
	System.out.println(s2);
	}

}
