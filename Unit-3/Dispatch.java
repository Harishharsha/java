class A {
	void callme() {
	System.out.println("Inside A's callme method");
	}
}
class B extends A {

	void callme() {
	System.out.println("Inside B's callme method");
	}
}
class C extends A {

	void callme() {
	System.out.println("Inside C's callme method");
	}
}
class Dispatch {
	public static void main(String args[]) {
		A a = new A(); 
		B b = new B(); 
		C c = new C(); 
		A r; 
		r = a; 
		r.callme(); //a  
		r = b; 
		r.callme(); //ab
		r = c; 
		r.callme(); //abc
		/*a.callme();
		b.callme();
		c.callme();*/
	}
}