package Practise_pro;
import java.util.Scanner;
public class remove_spaces 
{
	public static void main(String[] args)
  {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s1=in.nextLine();
		System.out.println(s1.trim());
	}

}
