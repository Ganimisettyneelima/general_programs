package Practise_pro;

import java.util.Scanner;

public class arrayprime
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=0;
		int size =scanner.nextInt();
		int[] iarr=new int[size-1];
		for(int i=0;i<=iarr.length-1;i++)
			
		{
			iarr[i]=scanner.nextInt();
		}
		for(int i=0;i<=iarr.length-1;i++)
		{
			count=0;
			for(int j=0;j<=iarr.length-1;j++)
			{
				if(iarr[i]%iarr[j]==0)
				{
					count++;
				}
			}
			
		}
		if(count!=0)
		{
			System.out.println("count of prime numbers "+count);
		}
		
	}

}
