class threadinc extends Thread
{  
	int counter=0;
	synchronized void incrementMethod(){
	++counter;
	System.out.println("Current Value of Counter is "+counter);
}
}
public class Exp9pro3 {
	public static void main(String args[])
	{  
	 threadinc inc=new threadinc();
	 Thread T1=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T2=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T3=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T4=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T5=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T6=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T7=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T8=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };Thread T9=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 Thread T10=new Thread()
	 {
		public void run()
		{
			inc.incrementMethod();
		}
	 };
	 T1.start();
	 T2.start();
	 T3.start();
	 T4.start();
	 T5.start();
	 T6.start();
	 T7.start();
	 T8.start();
	 T9.start();
	 T10.start();
	 
	}
}