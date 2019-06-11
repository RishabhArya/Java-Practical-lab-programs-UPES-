import java.util.Scanner;
class employee{
	String empname;
	int empage;
	employee(String n,int a)
	{
		empname=n;
		empage=a;
	}
}
class NameException extends Exception
{
	void message()
	{
	  System.out.println("entered name has digits.");
	}
}
class AgeException extends Exception
{
	private static final boolean True = false;
	void show() 
	{
		System.out.println("enter age is greater than 50");
	}
	int CheckName(String name)
	{
		char[] charArray = name.toCharArray();
		for (int i = 0;i < name.length(); i++)
		{
		  boolean b1=Character.isDigit(charArray[i]);
		   if (b1==True)
				{
					return 1;
				}
				else
				{
					return 0;
				}
					
			}
		return 0;
			
		}
	}
public class Exp7pr5 {
	public static void main(String[] args)
	{
		System.out.println("Please Enter your name");
		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		
}
}