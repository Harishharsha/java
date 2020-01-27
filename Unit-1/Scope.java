class Scope {
	
	static int x=10; // known to all code within main

public static void main(String args[]) {

if(x == 10) { // start new scope
int y = 20; // known only to this block
// x and y both known here.
x=5;
System.out.println("x and y: " + x + " " + y);
x = y * 2;
System.out.println("x and y: " + x + " " + y);
}
}
}