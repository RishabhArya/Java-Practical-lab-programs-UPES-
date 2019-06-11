import java.util.Scanner;
public class prog2 {
	public static void main(String arr[])
	{
	System.out.println("Please Enter");
	Scanner aqe=new Scanner(System.in);
	String name=aqe.nextLine();
	String strArray[]=name.split(" ");
	int count1=1;
	int count[]=new int[strArray.length];
	for (int i=0;i<strArray.length;i++)
	{
		count[i]=0;
		for(int j=0;j<strArray.length;j++)
		{
			if(i!=j)
			{
			if(strArray[i].equals(strArray[j]))
			{
			   count[i]++;
			}
			}
		}
	}
	for(int k=0;k<strArray.length;k++)
	{
		
		System.out.println("The Frequency of word "+strArray[k]+" is "+count[k]);
	}
	}
}
