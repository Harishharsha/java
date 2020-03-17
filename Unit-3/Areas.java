abstract class figure 
{
	double dim1,dim2;
	figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
		abstract double area(); 
	}
class rectangle extends figure
{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	
	double area()
	{
		return (dim1*dim2);
	}
}
class triangle extends figure
{
	triangle(double a,double b)
	{
		super(a,b);
	}
	
	double area()
	{
		return (dim1*dim2)/2;
	}
}
class Areas
{
	public static void main(String args[])
	{
		rectangle r=new rectangle(2,3);
		triangle t=new triangle(4,5);
		System.out.println("the area of rectangle is "+r.area());
		System.out.println("the area of triangle is "+t.area());
	}
}