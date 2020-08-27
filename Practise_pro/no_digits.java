package Practise_pro;

public class no_digits
{
	public static void main(String[] args) {
		String s1="neelu8raji3pavs4";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println("the no of digits in given String is "+count);
	}

}
