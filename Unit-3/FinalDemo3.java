class Base { 
	public final void display() {
		System.out.println("Hi this is super class");
		} 
} 

class Derived extends Base { 
	public void display() {
	System.out.println("Hi this is Derived class");
	} 
} 

public class FinalDemo3 { 
	public static void main(String args[]) { 
		Base b = new Derived(); 
		b.display(); 
	} 
} 
