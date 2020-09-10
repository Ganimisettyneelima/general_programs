package genaral_programs;
import java.util.Scanner;
public class Even_numbers_printing
{
	public static void main(String[] args) 
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enetr any number to print range of prime numbers");
	int range=in.nextInt();
    for(int n=1;n<=range;n++)
    {
    	for(int n2=2;n2<=n/2;n2++)
    	{
    		if(n2%2==0)
    		{
    			System.out.println(n2);
    		}
    	}
    }
	
	}
}
