class  numberpattern3

{
	public static void main(String[] args) 
	{
		int num=0;
		for(int i=1;i<=5;i++)
		{
			num++;
			for(int j=1;j<=num;j++)
			{
				if (j==1)
				{
				
				System.out.print(i);
			}
			else if (j==2)
			{
				System.out.print(4+i);

			}
			else if(j==3)
				{
				System.out.print(i+7);
				}
				else if(j==4)
				{
					System.out.print(i+9);
				}
				else
				{
					System.out.print(i+10);
				}
			}
		System.out.println();
	}

	

}
}