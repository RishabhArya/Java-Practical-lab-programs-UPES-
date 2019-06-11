import java.util.Scanner;
public class program {
	public static void main(String arr[])
	{
	System.out.println("Please Enter");
	Scanner aqe=new Scanner(System.in);
	String name=aqe.nextLine();
	String strArray[]=name.split(" ");
	int count1;
	int count[]=new int[strArray.length];
	for (int i=0;i<strArray.length;i++)
	{
		count1=0;
		for(int j=0;j<strArray.length;j++)
		{
			if(j != i )
			{
				if(strArray[j]==strArray[i])
				{
					count1=count1+1;
				}
			}
			count[j]=count1;
		}
	}
	for(int k=0;k<strArray.length;k++)
	{
		System.out.println("The Frequency of word "+strArray[k]+" is "+count[k]);
	}
	}
}
