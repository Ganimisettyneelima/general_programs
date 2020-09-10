

class starpattern2 
{
	public static void main(String[] args) 
	{
		int star=0;
		int space=4;
		for(int i=1;i<=7;i++)
		{
		
				if(i<=4)
				{
					space--;
					star++;
				}
				else
				{
					space++;
					star--;
				}
				for(int n=1;n<=space;n++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=star;k++)
				{
					System.out.print("* ");
				}
			
			System.out.println();
		
	}
		
}
}