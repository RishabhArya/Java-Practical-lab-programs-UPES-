import java.util.Scanner;
class VechException extends Exception
{
	public void message()
	 {
		System.out.println("Both Vechicles are moving in the same direction");
	 }
	public int CheckDirection(int d1, int d2)
	{
		if(d1==d2)
		  {
			  return 1;
		  }
		else {
			return 2;
		}
	}
}
	public class Exp7pr4 {
      public static void main(String arr[]) 
	{    
          Scanner s1=new Scanner(System.in);
    	  System.out.println("Enter the direction in which you are moving 1.forward 2.Backward");
    	  int d1=s1.nextInt();
    	  System.out.println("Enter the direction in which other vechicle is moving 1.forward 2.Backward");
    	  int d2=s1.nextInt();
    	  VechException v1 = new VechException();
    	  try
    	  {
    		  if(v1.CheckDirection(d1,d2)==1)
    		  {
    			  System.out.println("No Exception occurs.");
    		  }
    		  if(v1.CheckDirection(d1,d2)==2)
    		  {
    			  System.out.println("Exception occurs.");
    			  throw new VechException();
    		  }
    	  }
    	  catch(VechException v)
    	  {
		    v.message();
    	  }
	}
}