class numberpattern4 
{
	public static void main(String[] args) 
	{ 
		int space=-1;
		int num=6;
		
		for(int i=1;i<=5;i++)
		{
			 space++;
		      num--;
			  int n= space+1;
			for(int j=1;j<=space;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=num;k++)
			{
			System.out.print(n+ " ");
			  n=++n;
			}
			System.out.println();

	}
}
}