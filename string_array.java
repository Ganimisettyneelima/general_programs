import java.util.Scanner;
class string_array
{
  public static void main(String[] args) 
	{
	  Scanner in=new Scanner();
	  int size=in.nextInt();
	  System.out.println("enter elements of String");
	  int[] a1=new int[size];
	  for(int i=0;i<=a1.length-1;i++)
		{
			a[i]=in.nextInt();
		}
		for(int j=1;j<=100;j++)
		{
			int status=0;
			for(int k=0;k<=a1.length-1;k++)
			{
				if(j==a1[k])
				{
					status=1;
					break;
				}
			}
			if(status==0)
			{
				System.out.println(j);
			}
            
		}


	   	
}
}