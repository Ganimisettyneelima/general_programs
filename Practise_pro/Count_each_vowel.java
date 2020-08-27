package Practise_pro;
import java.util.Scanner;
public class Count_each_vowel 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter any String");
		String s1=in.next();
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
		
		if(c=='a')
		{
			count1++;
			
		}
		else if(c=='e') {
			count2++;
			
			
		}
		else if(c=='i')
		{
			count3++;
		
		
		}
		else if(c=='o')
		{
		
			count4++;
		
		
		}
		else if(c=='u')
		{
			count5++;
		
		
		
		}

}
		System.out.println("count of a is "+count1);
		System.out.println("count of e is "+count2);
		System.out.println("count of i is "+count3);
		System.out.println("count of o is "+count4);
		System.out.println("count of u is "+count5);
	}
}
