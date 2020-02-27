class A2{
static int a;
	static{
		a=10;
		System.out.println("static block is invoked");
	s();}
public static void main(String args[]){
System.out.println("Hello main");
}
static void s(){
	System.out.println("hi"+a);
}
}