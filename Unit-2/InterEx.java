interface Sam{
	int a=10;
	void display();
	default void sample(){
		System.out.println("hi");
	}	
}
class InterEx implements Sam{

	public static void main(String[] arg){
		InterEx e=new InterEx();
		System.out.println(a);
		e.display();
		e.sample();
	
	
	}
	public void display (){
		System.out.println("Interface Implemented display method");
	}
}