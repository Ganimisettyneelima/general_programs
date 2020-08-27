package Practise_pro;
import java.util.Scanner;
public class Reverse_sentence_words 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2="";
		String s3="";
		String [] sarr=s1.split(" ");
		for(int i=0;i<=sarr.length-1;i++)
		{
			for(int j=sarr.length-1;j>=0;j--)
			{
				char c=sarr[i].charAt(j);
				s2=s2+c;
			}
			
			s3=s2+" ";
		}
		System.out.println(s3);
	}

}
