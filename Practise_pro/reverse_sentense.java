package Practise_pro;

public class reverse_sentense
{
	public static void main(String[] args) {
		String s1="we have presentation class";
		String s3="";
		String[] s2=s1.split(" ");
		 s3=s2[s2.length-1];
		
		for(int i=s2.length-1;i>=0;i--)
		{
			//char c=s2
			s3=s3+" "+s2[i];
		}
		System.out.println("reverse of the sentence is "+s3);
	}

}
