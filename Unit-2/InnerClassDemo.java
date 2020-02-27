class OuterC
{ 
	int outer_x = 10; 
	int outer_y = 20; 
	private int outer_private = 30; 
	class InnerC
	{ 
		void display() 
		{ 
			System.out.println("outer_x = " + outer_x); 
			System.out.println("outer_y = " + outer_y); 
			System.out.println("outer_private = " + outer_private); 
		
		} 
	} 
} 


public class InnerClassDemo 
{ 
	public static void main(String[] args) 
	{ 
		OuterC outerObject = new OuterC(); 
		OuterC.InnerC innerObject = outerObject.new InnerC(); 
		
		innerObject.display(); 
		
	} 
} 
