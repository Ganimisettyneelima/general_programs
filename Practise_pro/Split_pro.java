package Practise_pro;

public class Split_pro 
{
	public static void main(String[] args) 
	{
		String s1="java html sql";
		String[] ar=s1.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
