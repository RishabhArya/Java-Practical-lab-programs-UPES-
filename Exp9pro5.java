public class Exp9pro5 {
	public static void main(String args[]) {
	final String S1 = "String One";
	final String S2 = "String Two";
	final String S3 = "String Three";
	Thread T1=new Thread()
	{
		public void run()
		{
			synchronized (S1)
			{   
				System.out.println("T1 locked S1 and trying for S2");
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (S2)
				{   
			           System.out.println("T1 locked S2");
			    }    
		     }
		}
	};
	Thread T2=new Thread()
	{
		public void run()
		{
			synchronized (S2)
			{   
				System.out.println("T2 locked S2 and trying for S3");
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (S3)
				{   
			           System.out.println("T2 lock S3");
			    }    
		     }
		}
	};
	Thread T3=new Thread()
	{
		public void run()
		{

			synchronized (S3)
			{   
				System.out.println("T3 locked S3 and trying for S1");
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (S1)
				{   
			           System.out.println("T3 locks S1");
			    }    
		     }
		}
	};
	T1.start();
	T2.start();
	T3.start();
	}
}
