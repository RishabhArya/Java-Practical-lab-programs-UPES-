import java.util.Scanner;
public class prog5 {
	public static void main(String arr[])
	{
	System.out.println("Please Enter First Paragraph");
	Scanner aqe=new Scanner(System.in);
	String str1=aqe.nextLine();
	System.out.println("Please Enter Second Paragraph");
	String str2=aqe.nextLine();
	String str3=str1+" "+str2;
	System.out.println(str3);
	String strArray[]=str3.split(" ");
	String strArray2[]= new String[strArray.length];
	for(int i=0;i<strArray.length;i++)
	{
		for(int j=i;j<strArray.length;j++)
		{
			if (strArray[i].compareTo(strArray[j]) > 0) 
            {
				String s = strArray[i];
				strArray[i] = strArray[j];
                strArray[j] = s;
            }
         }
	}
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < strArray.length; i++) {
	    sb.append(strArray[i]);
	    if (i != strArray.length - 1) {
	        sb.append(" ");
	    }
	}
	String joined = sb.toString();
	
	System.out.println("the alphabatic arrangement is---"+joined);
	}
}