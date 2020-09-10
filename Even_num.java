package genaral_programs;
import java.util.Scanner;
public class Even_num {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter any number");
	int n=in.nextInt();
	if (n%2==0)
	{
		System.out.println("given number is even"+ n);
	}
	else 
	{
		System.out.println("given number is not even number");
	}
}
}
