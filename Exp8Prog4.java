import java.io.*;
public class Exp8Prog4 {
	public static void main(String[] args) throws IOException{
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String input=reader.readLine(); 
	int len=input.length();
	System.out.println("Length of String is"+len);
	 int vcount=0;
	 for(int i = 0; i <input.length(); ++i)
     {//String name="HARSH";
         char ch = input.charAt(i);
         if(ch == 'a' ) {
        	 System.out.print("Occured At "+input.indexOf(ch));
             ++vcount;
         }
        
	   }
	   System.out.println("No of times a has appeared in "+input+" is:"+vcount);
}
}