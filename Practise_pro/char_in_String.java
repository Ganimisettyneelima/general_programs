package Practise_pro;
import java.util.Scanner;
public class char_in_String 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		char c=in.next().charAt(0);
        for(int i=0;i<=s1.length()-1;i++)
        {
        	char ch=s1.charAt(i);
        	if(c==ch)
        	{
        		System.out.println("index of the given char in a given String is "+i);
        	}
        }
	}

}
