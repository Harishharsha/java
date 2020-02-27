class ReturnObj{
	int a=10,b=20;
	public static void main(String []a){
		int sum=0;
		ReturnObj o=new ReturnObj();
		sum=o.add(o);
		System.out.println("addition of a and b is"+sum);
	}
	public int add(ReturnObj o){
		return o.a+o.b;
	}
}