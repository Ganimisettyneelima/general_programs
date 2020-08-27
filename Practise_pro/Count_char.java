package Practise_pro;

public class Count_char 
{
	public static void main(String[] args) {
		String s1="devoloper ";
		char c='e';
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		System.out.println("count of character "+c+" in a given String is "+count);
	}

}
