package Practise_pro;
import java.util.Scanner;
public class last_two_words 
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter any sentence");
		String s1=in.nextLine();
		String[] sarr=s1.split(" ");
		System.out.println(sarr[sarr.length-1]);
		System.out.println(sarr[sarr.length-2]);
	}

}
