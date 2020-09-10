//devolope a non static method to perform additon opertion for two  numbers take the input for the devoloped method as a part of method signature .
//devoloped method must return sum of the two num when ever it is called  print the result using by concatination 




class sum
{

public static int addition(int a,int b)
	{
	    
		int k=a+b;
		// System.out.print("Sum of given two numbers " +  a   +   b  + "is" +	sum);
	

	 return	k;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		sum o=new sum();
		int k= o.addition(3,6);
		System.out.println(k);
		System.out.println("main ends");
	}

}
