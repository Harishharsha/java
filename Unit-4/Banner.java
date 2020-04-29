public class Banner
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String msg="Harish";//
		char ch;
		for(;;){
			try{
	ch = msg.charAt(0);
	Thread.sleep(250);
	msg = msg.substring(1, msg.length());
	msg += ch;
	System.out.print(ch);
			}
			catch(InterruptedException e){}
	}
}
}
