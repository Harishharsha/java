class PrimeNo{
	public static void main(String[] a){
		int num;
		boolean isprime=true;
		num=Integer.parseInt(a[0]);
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isprime=false;
				break;
			}
		}
		if(isprime)System.out.println(num +" is a prime number");
		else
			System.out.println(num +" is not a prime number");
	}
}