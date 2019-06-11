import java.io.*;
public class Exp8Prog2
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    	String input=reader.readLine();
    	StringBuffer output=new StringBuffer("");
    	 for (int i = 0; i< input.length(); i++)
         {
             char aChar = input.charAt(i);
             if (97 <= aChar && aChar<=122)
             {
                 aChar = (char)( (aChar - 32) ); 
                
             }
             output.append(aChar);
            
          }
    	 System.out.print(output);
    	
    }
}
