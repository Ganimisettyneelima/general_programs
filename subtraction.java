

//take three integer inputs ,if the sum of the 3 integers is even num perform additon operation ,if the sum of the 3 int nums is odd then perform multiplication for 3 nums
//devolop a non static for above req print the result by using concatination

class  subtraction
{

	public void sample()
	{
		int a=10,b=5,c=5;
		int sum=(a+b+c);
		int mul=(a*b*c);
		
		if(sum%2==0)
		{
         System.out.println("sum of 3 integers is even then addition of numbers " +		a	+	b	+	c	+"is"	+	sum);

			 }

	else 
		{
		System.out.println("sum of given 3 numbers is odd then the multiplication of 3 numbers  "+	a	+	b	+	c	+"is"	+	mul);
		}
	}
	public static void main(String[] args) 
	{
	   subtraction o = new subtraction();
	   o.sample();
	}
}