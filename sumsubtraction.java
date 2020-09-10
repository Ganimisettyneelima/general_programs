

//take three integer inputs ,if the sum of the 3 integers is even num perform additon operation ,if the sum of the 3 int nums is odd then perform multiplication for 3 nums
//devolop a non static for above req print the result by using concatination

class  sumsubtracton
{

	public void sample()
	{
		int a,b,c,sum,addition,mul;
		sum=a+b+c;
		mul=a*b*c;
		addition=a+b+c;
		if(sum%2==0)
		{
         System.out.println("sum of 3 integers is even then addition of numbers " +		a	+	b	+	c	+"is"	+	addition);

			 }

	else 
		{
		System.out.println("sum of given 3 numbers is odd then the multiplication of 3 numbers  "+	a	+	b	+	c	+"is"	+	mul);
		}
	}
	public static void main(String[] args) 
	{
	   sumsubtraction o = new sumsubtraction();
	   o.sample();
	}
}