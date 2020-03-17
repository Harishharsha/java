class parent
{
	int width,length;
	parent()
	{
		width=4;
		length=5;
	}
	parent(int i,int j)
	{
		width=i;
		length=j;
	}
}
class child extends parent
{
	int width=10,length=20;
	child()
	{
		super();
	}
	public int area()
	{
		return (super.width*super.length);
	}
}
class Sup2
	{
	public static void main(String args[])
	{
		child c=new child();
		System.out.println("Area is:"+c.area());
	}
}