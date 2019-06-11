class items extends Thread
{
	int counter=0;
	synchronized void i()
	{
		while(counter!=0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("I \n");
		notifyAll();
		counter=1;
	}
	synchronized void love()
	{
		while(counter!=1)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("Love \n");
		notifyAll();
		counter=2;
	}
	synchronized void upes()
	{
		while(counter!=2)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("upes \n");
		notifyAll();
		counter=0;
	}
	
}
public class iloveupes 
{
	public static void main(String args[]) {
	items caller =new items();
		items T1=new items(){
		public void run()
		{
			while(true) {
			caller.i();
			}
		}
	};
	items T2=new items(){
		public void run()
		{
			while(true) {
			caller.love();}
		}
	};
	items T3=new items(){
		public void run()
		{
			while(true) {
			caller.upes();}
		}
	};
	T1.start();
	T2.start();
	T3.start();
}
}
