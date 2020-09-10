class numberpattern2 
{
	public static void main(String[] args) 
	{
		int num=0;
		for(int i=1;i<=5;i++)
		{ 
			num++;
			
			for(int j=1;j<=num;j++)
			{
				if(j==1||j==3||j==5)
				{
		       System.out.print('1');
				}
				else 
				{
					System.out.print('0');
				}
			}
			System.out.println();
	}


}
}
