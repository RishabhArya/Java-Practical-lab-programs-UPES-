import java.util.Scanner;
public class Exp7Prog2 
{
public static void main(String[] args) 
 {
   try
    {
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter divisor:");
      int s=s1.nextInt();
     if(d==0)
      {
        System.out.println("Exception occurs.");
        throw new Exception();
     }
     else 
      {
	  float r=100/d;
        System.out.println("Result is:"+r);
      }
   }
   catch(Exception e)
   {
      System.out.println(e);
   }
 }
}
