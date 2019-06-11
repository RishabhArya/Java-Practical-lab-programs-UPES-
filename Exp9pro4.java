//Write a Java program to create five threads with different priorities. 
///Send two threads of the highest priority to sleep state. Check the aliveness of the threads and mark which thread is long lasting
class threads extends Thread
{  
	public void run()
	{  
		System.out.println("This is a thread ");  	
	}  
}
public class Exp9pro4{
	public static void main(String args[])
	{  
		threads t1=new threads()
		{
		    public void run() {
		    try{Thread.sleep(500);}
		    catch(InterruptedException e)
		    {System.out.println(e);}
		    }
		};
		threads t2=new threads()
		{
		    public void run() {
		    try{Thread.sleep(500);}
		    catch(InterruptedException e)
		    {System.out.println(e);}
		    }
		};
		threads t3=new threads();
		threads t4=new threads();
		threads t5=new threads();
		t1.setPriority(10);  
		t2.setPriority(10); 
		t3.setPriority(5);  
		t4.setPriority(4);
		t5.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println(t1.isAlive()); 
        System.out.println(t2.isAlive());
		System.out.println(t3.isAlive()); 
        System.out.println(t4.isAlive());
		System.out.println(t5.isAlive()); 
	}  
}  