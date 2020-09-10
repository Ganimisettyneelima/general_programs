class A
{
	int z;
	public A(int z)
	{
		this.z=z;
	}
}
class B extends A
{
	boolean h;
	public B(int z,boolean h)
	{
		super(z);
		this.h=h;
	}
}
class C extends A
{
	char c;
	public C(int z,char c)
	{
		super(z);
		this.c=c;
	}
}
class D extends C
{
	String s;
	public D(int z,char c,String s)
	{
		super(z,c);
		this.s=s;
	}
}


class  hybridinh

{
	public static void main(String[] args) 
	{
		B b=new B(6,true);
		C c=new C(7,'&');
		D d=new D(18,'#',"neeelima");
		System.out.println(b.z);
		System.out.println(b.h);
		System.out.println(c.z);
		System.out.println(c.c);
		System.out.println(c.c);
		System.out.println(d.z);
		System.out.println(d.c);
		System.out.println(d.s);
		
	}
}
