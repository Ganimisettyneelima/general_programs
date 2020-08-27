package Practise_pro;

public class Words_sentense 
{
	public static void main(String[] args) {
		String s="we have presentation class";
		//String s2="";
		int count=0;
		String[] ar=s.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			count ++;
		}
		System.out.println("the no of words "+count);
	}

}
