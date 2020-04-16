interface Inf{
	void show();
	void display();
	
}

abstract class Inter implements Inf
{
	
	
	public void show(){
		System.out.println("Hi this is Show method");
		}
}
public class PartInterface extends Inter{
	public static void main(String []args){
		PartInterface obj=new PartInterface();
		obj.display();
		obj.show();
	}
	public void display(){
		System.out.println("Hi this is Display method");
	}
}
