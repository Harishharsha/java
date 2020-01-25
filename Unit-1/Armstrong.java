
class Armstrong{
	public static void main(String []a){
		int n=153;
		int temp=n;
		int m=0,i=0,r=1;
		while(temp>0){
			temp=temp/10;
			++m;
		}
		System.out.println(m);
		temp=n;
		while(n>0){
			r=n%10;
			i+= Math.pow(r,m);
			n=n/10;
			System.out.println(i);
		}
		if(temp==i){
			System.out.println("The given number "+i+" is an armstrong number");
		}
		else
			System.out.println("The given number "+i+" is not an armstrong number");
	
		
	}
}

