interface Sam{
	int a=10;
	void display();
	}
class InterEx implements Sam{

	public static void main(String[] arg){
		InterEx e=new InterEx();
		System.out.println(a);
		e.display();
	
	
	}
	public void display (){
		System.out.println("Interface Implemented display method");
	}
}