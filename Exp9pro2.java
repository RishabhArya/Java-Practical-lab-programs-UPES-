class threadeven extends Thread
{  
	public void run()
	{  
		for(int i=2;i<10;i=i+2)
		{
			System.out.println(i);
		}	
	}  
}
class threadodd extends Thread
{  
	public void run()
	{  
		for(int i=1;i<10;i=i+2)
		{
			System.out.println(i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  
}

public class Exp9pro2{
	public static void main(String args[])
	{  
		threadeven t1=new threadeven();
		threadodd t2=new threadodd();
		t2.start();
		t1.start();
	}
}  