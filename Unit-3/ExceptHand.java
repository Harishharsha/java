class ExceptHand{
	public static void main(String[] arg){
		int a=10,b=0,c;
		try{
			c=a/b;
			}
			catch(ArithmeticException e){
				System.out.println("Divided by zero"+e);
			}
			System.out.println("hi");
	}
}