class CurrentThreadDemo2 extends Thread
{
	public static void main(String args[])
	{
		Thread t = new Thread();
		//Thread t =Thread.currentThread();
		System.out.println("Default Priority: " + t.getPriority());
		
		t.setPriority(MIN_PRIORITY);
		
		System.out.println("Minimum Priority: " + t.getPriority());
		
		t.setPriority(MAX_PRIORITY);
		
		System.out.println("Maximum Priority: " + t.getPriority());
		
	}
}