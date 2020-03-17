class one 
{ 
	public void print_geek() 
	{ 
		System.out.println("Geeks"); 
	} 
} 

class two extends one 
{ 
	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 

class three extends one 
{ 
	/*............*/
} 

// Drived class 
public class Hierarchical 
{ 
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.print_geek(); 
		two t = new two(); 
		t.print_for(); 
		g.print_geek(); 
	} 
} 
