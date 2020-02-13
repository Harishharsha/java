import java.util.Scanner;
class ArithmeticOp{
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two elements:");
		a=sc.nextInt();
		b=sc.nextInt();
		Ex1 ex=new Ex1();
		ex.add(a,b);
		ex.sub(a,b);
		ex.mul(a,b);
		ex.div(a,b);
		ex.mdiv(a,b);
		ex.ic(a);
		ex.dc(b);
		
	}
	public void add(int c,int d){
	System.out.println("addition of two no is:"+(c+d));
	}
	
	public void sub(int c,int d){
			System.out.println("Subtraction of two no is:"+(c-d));
		
	}
	public void mul(int c,int d){
		System.out.println("Multiplication of two no is:"+(c*d));
	}
	
	public void div(int c,int d){
		try{
		System.out.println("Divison of two no is:"+(c/d));
		}
		catch(Exception ae){
			System.out.println("exception");
		}
		
	}
	
	public void mdiv(int c,int d){
		try{
		System.out.println("Modulo Divison of two no is:"+(c%d));
		}
		catch(Exception ae){
			System.out.println(ae);
		}
	}
	
	public void ic(int c){
		System.out.println("Increment of a is:"+c);
	}
	
	public void dc(int d){
		System.out.println("Decrement of b is:"+d);
	}
}