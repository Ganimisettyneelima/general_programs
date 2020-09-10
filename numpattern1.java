//1 A 3
//4 B 6
//7 C 9

//print all even numbers from 1to50 that are exactly divisible by 7 and 8

//devolope a non static method toperform additon opertion for two two numbers take the input for the devolaoped method as a part of method signature .
//devoloped method must return sum of the two num when ever it is called  print the result using by concatination 


class numpattern1 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=3;i++)
		{
           for (int j=1;j<=3;j++ )
           {
			  count=++count;
			  if(count==2)
			   {
				  System.out.print('A');
			   }
			   else if(count==5)
			   {
				   System.out.print('B');
			   }
			   else if(count==8)
			   {
				   System.out.print('C');
			   }
			   
			   else
			   {
			   System.out.print(count);
			   }
		   }
		   
		System.out.println();
	}
}
}
