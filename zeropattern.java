class zeropattern

{
	public static void main(String[] args) 
	{
		int num=-1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if (i==j)
				
				{
				System.out.print(++num);
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