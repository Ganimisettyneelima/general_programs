package Practise_pro;

public class sum_digits
{
	public static void main(String[] args)
	{
		String s1="neelu8raji3pavs4";
		int n=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if( Character.isDigit(c))
			{
				String s2=c+"";
				int k=Integer.parseInt(s2);
	             n=n+k;
			}
		}
		System.out.println("sum of digits in given String is "+n);
	}

}
