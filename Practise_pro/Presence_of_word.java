package Practise_pro;
import java.util.Scanner;
public class Presence_of_word 
{
   public static void main(String[] args) 
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("enter any String");
	   String s1=in.nextLine();
	   System.out.println("enter a word");
	   String s2=in.next();
	   String[] sarr=s1.split(" ");
	   for(int i=0;i<=sarr.length-1;i++)
	   {
		   if(s2.equals(sarr[i]))
		   {
			   System.out.println("given word is present in given String in the index no "+i);
		   }
	   }
	
}
}
