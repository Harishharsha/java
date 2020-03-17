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
		System.out.println("Area is"+wid*len);
	}
}

class Finaldemo2
{
	public static void main(String args[])
	{
		
		fig f=new fig();
		f.area();
		fig f1=new fig(4.5,5.0);
		f1.area();
		
		
	}
}