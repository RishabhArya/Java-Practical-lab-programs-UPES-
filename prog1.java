import java.util.Scanner;
public class prog1 {
	public static void main(String[] args) {
       Scanner s1=new Scanner(System.in);
       System.out.println("Please Enter the paragraph:");
       String str=s1.nextLine();
       String strArr[] =str.split(" ");
       int count[] =new int[strArr.length];
       for(int i=0;i<strArr.length;i++)
       {   
    	   String st=strArr[i].toLowerCase();
    	   char charArray[]=strArr[i].toCharArray();
    	   int sum=0;
    	   for(int k=0;k<charArray.length;k++) 
    	   {
    		   if(charArray[k]==97 ||charArray[k]==101 ||charArray[k]==105 ||charArray[k]==111 || charArray[k]==119)
    		   {   
    			   sum++;
    		   }   
    	   }
    	   count[i]=sum;
       }
       for(int i=0;i<strArr.length;i++) 
       {
    	   System.out.println(strArr[i]+" "+count[i]);
       }
       
	}

}