interface A 
{ 
	public void print_geek(); 
} 
interface B extends A
{
	public void print_for();
}
interface C extends A
{
	public void print_for();
}
interface D extends B,C
{
	public void print_for();
}
public class HybridIn implements D
{
	public void print_for(){
		System.out.println("for");
	}
	public void print_geek(){
		System.out.println("Geeks");
	}
	public static void main(String []aa){
		
		HybridIn h=new HybridIn();
		h.print_geek();
		h.print_for();
		h.print_geek();
		
	
	
	}
}
