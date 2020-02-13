class Object{
	public static void main(String[] args){
	    int c;
		Object o=new Object();
		Data d=new Data();
		c=o.print(d);
		System.out.println(c);
	
	}
	int print(Data o){
		return o.a+o.b;
	}
}
class Data{
		int a=10,b=20;
}