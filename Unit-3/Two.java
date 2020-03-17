class one 
{ 
	public void print_geek() 
	{ 
		System.out.println("A"); 
	} 
} 

class Two extends one 
{ 
public static void main(String[] args) 
	{ 
		Two g = new Two(); 
		g.print_geek(); 
		g.print_for(); 
		//g.print_geek(); 
	} 
	public void print_for() 
	{ 
		System.out.println("B"); 
	}
		
} 
