class runnableinterface implements Runnable 
{   
        public void run() 
        { 
            System.out.println("This is implemented using runnable"); 
        }

} 
class threads extends Thread
{  
	public void run()
	{  
		System.out.println("This is implimented using thread ");  	
	}  
}
public class Exp9pro1{
	public static void main(String args[])
	{  
		threads t1=new threads();
		runnableinterface runn=new runnableinterface();
		Thread t2 =new Thread(runn);
		t1.start();
		t2.start();
	}  
}  