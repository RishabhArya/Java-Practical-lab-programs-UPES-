import java.util.Scanner;
public class Exp7Prog1
 {
    public static void main(String[] args) 
    {
		try 
		{
			Scanner s1=new Scanner(System.in);
			String a[]=new String[10];
			int b[]=new int[10];
			System.out.println("enter name and roll number of 10 students:");
			for(int i=0;i<10;i++)
			{
	            a[i]=s1.next();
	            b[i]=s1.nextInt();
			}
			System.out.println(a[11]);
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
 }
