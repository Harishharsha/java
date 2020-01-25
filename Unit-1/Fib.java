class Fib{
	public static void main(String []a){
		int f1=0,f2=1,f=0,n;
		n=Integer.parseInt(a[0]);
		
		
		for(int i=1;i<=n;i++)
			{
				
				System.out.print(f1+" ");
				f=f1+f2;
				f1=f2;
				f2=f;
			}
	}
	
}