import java.util.Scanner;

public class prog3n {
	public static void main(String arr[])
	{
	int temp;
	System.out.println("Please Enter");
	Scanner aqe=new Scanner(System.in);
	String name=aqe.nextLine();
	String strArray[]=name.split(" ");
	System.out.println("Please Enter Key");
	int k=aqe.nextInt();
	int count[]=new int[strArray.length];
	char [][]charArr2 = new char [20][20];
	char chartemp[] = null;
	String[][] arrays = new String[][] {} ;
	for (int i=0;i<strArray.length;i++)
	{
		char[] charArr = strArray[i].toCharArray();
		for(int j=0;j<charArr.length;j++)
		{
			temp=charArr[j];
			if(temp>=65&&temp<=90)
			{
				temp=temp+k;
				if(temp>90)
				{
					temp=temp-26;
				}
			}
			if(temp>=97&&temp<=122)
			{
				temp=temp+k;
				if(temp>122)
				{
					temp=temp-26;
				}
			}
		 chartemp[j]=(char) temp;
		 charArr2[i][j]=(char) temp;
		}
	   String b = new String(chartemp);
	   System.out.println(b);
	}
	for (int i=0;i<strArray.length;i++)
	{
		char[] charArr = strArray[i].toCharArray();
		for(int j=0;j<charArr.length;j++)
		{
			;
		}
		
	}
	}
}
