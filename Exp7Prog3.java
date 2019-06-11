class NumException extends Exception
{
	public void message()
	 {
		System.out.println("non numeric value");
		System.out.println("My custom exception");
	 }
}
	public class Exp7Prog3 {
      public static void main(String arr[]) 
	{    
           try
		{
		   int a=Integer.parseInt(arr[0]);
		   throw new  NumException();
		}
		catch(NumException ex)
		{
		    ex.message();
		}
	}
}
