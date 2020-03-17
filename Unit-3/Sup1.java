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
class child extends parent{
	child()
	{
		super(5,6);
	}
	public int area()
	{
		return(width*length);
	}
}
class Sup1
{
	public static void main(String args[])
	{
		child c=new child();
		System.out.println("Area is:"+c.area());
	}
}