class Instance{
public static void main(String []a){

	Instance obj=new Instance();
	System.out.println("Obj is an instanceof "+(obj instanceof Instance));
	A obj1=new A();
	System.out.println("Obj is an instanceof "+(obj1 instanceof A));
	}
}
class A{
}