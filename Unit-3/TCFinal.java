class TCFinal{
	public static void main(String[] args){
		
		try{
			System.out.println(args[2]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("ArrayIndexOutOfBoundsException raised");
				
			}
			finally{
				System.out.println("finally block");
				}
	}
}
				