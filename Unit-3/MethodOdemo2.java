class fig
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
	public void area()
	{
		System.out.println("Area cannot be computed for fig class");
	}
}
class tri extends fig
{
	tri(double i,double j)
	{
		super(i,j);
	}
	public void area()
	{
		System.out.println("area of triangle is "+((wid*len)/2));
	}
}
class rec extends fig
{
	rec(double i,double j)
	{
		super(i,j);
	}
	public void area()
	{
		System.out.println("area of rectangle is:"+(wid*len));
	}
}
class MethodOdemo2
{
	public static void main(String args[])
	{
		tri t=new tri(4.0,5.0);
		t.area();
		rec r=new rec(3.0,4.0);
		r.area();
	}
}