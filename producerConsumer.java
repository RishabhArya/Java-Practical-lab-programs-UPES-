class item extends Thread
{
	int counter=0;
	synchronized void producer()
	{
		while(counter==1)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		counter++;
		notifyAll();
	}
	synchronized void consumer()
	{
		while(counter==0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		counter--;
	}
}
public class producerConsumer 
{
	public static void main(String args[]) {
	item caller =new item();
		item T1=new item(){
		public void run()
		{
			while(true){
			caller.producer();
			System.out.println("counter at producer :"+caller.counter);
			}
		}
	};
	item T2=new item(){
		public void run()
		{
			while(true){
			caller.consumer();
			System.out.println("counter at consumer :"+caller.counter);
			}	
		}
	};
	T1.start();
	T2.start();
}
}

