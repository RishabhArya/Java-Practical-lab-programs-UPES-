import java.util.Scanner;
public class prog4 {
	public static void main(String arr[])
  {
	System.out.println("Please Enter The string");
	Scanner aqe=new Scanner(System.in);
	String name=aqe.nextLine();
	String strArray[]=name.split(" ");
	int flag=0,len=strArray.length;
	for(int j=0,k=len;j<len/2;j++,k--)
	{
		if(strArray[j]==strArray[k])
		{
			flag=0;
		}
		else
		{
			flag=1;
		}
	}
	if(flag==1)
	{
		System.out.println("The Entered String is not a Palindrome");
	}
	if(flag==0)
	{
		System.out.println("The Entered String is a Palindrome");
	}
  }
}
