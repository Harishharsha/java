final class fig
{
	double wid,len;
	fig()
	{
		wid=2.5;
		len=3.0;
	}
	fig(double i,double j)
	{
		wid=i;
		len=j;
	}
	final public void area() 
	{
		System.out.println("Area cannot be computed for fig class");
	}
}
class tri extends fig 
{
	tri()
	{
		super(4.5,5.2);
	}
	public void area() 
	{
		System.out.println("area of triangle is "+((wid*len)/2));
	}
}
class rec extends fig 
{
	rec()
	{
		super(4.2,5.0);
	}
	public void area()
	{
		System.out.println("area of rectangle is:"+(wid*len));
	}
}
class Finaldemo1
{
	public static void main(String args[])
	{
		tri t=new tri();
		t.area();
		rec r=new rec();
		r.area();
	}
}