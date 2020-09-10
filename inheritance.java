class A
{
	int i;
	public A(int i)
	{
		this.i=i;
	}


}
class B extends A
{
	int j;
	public B (int i,int j)
	{
		super(i);
		this.j=j;
	}
}
class C extends B
{
	double k;
	public  C(int i,int j,double k)
	{
		super(i,j);
		this.k=k;
	}
}



class  inheritance
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a=new A(5);
		B b=new B(3,5);
		C c=new C(3,5,2.4);
        System.out.println(a.i);
		System.out.println(b.i);
	    System.out.println(b.j);
		 System.out.println(c.i);
		  System.out.println(c.j);
		   System.out.println(c.k);
	}
}
