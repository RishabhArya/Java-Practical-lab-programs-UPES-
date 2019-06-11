import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Exp8Prog3
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    	String input=reader.readLine();
    	StringBuffer output=new StringBuffer("");
    	StringTokenizer S=new StringTokenizer(input);
    	while(S.hasMoreTokens()){
    		String a=S.nextToken();
                 char aChar = a.charAt(0);
                 if (97 <= aChar && aChar<=122)
                 {
                     aChar = (char)( (aChar - 32) ); 
                   
                 }
                 output.append(" "+aChar);
             //    System.out.print (aChar);
                 for(int i=1;i<a.length();++i){
                	  output.append(a.charAt(i));
                 }
                // output.append(aChar);
                 
                
              
    	}
    	
    	
    	 System.out.print(output+" ");
    	
    }
}
