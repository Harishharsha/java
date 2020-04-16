class NestedTry{
	public static void main(String []arg){
		int a=10,b=0,c;
			try{
				try{
					try{
						c=a/b;
						}
						catch(Exception e){
							System.out.println("zero");
							}
					}catch(Exception e){}
				}catch(Exception e){}
	}
}
						