import java.io.*;
class Occurrence
{ 
  public static void main (String[] args) throws IOException
  { 
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    String str=reader.readLine();
    String substr=reader.readLine();
  
    // Returns index of first occurrence of substring 
    int firstIndex = str.indexOf(substr); 
    System.out.println("First occurrence of"+ substr+" "
               + firstIndex); 
  
    // Returns index of last occurrence 
    int lastIndex = str.lastIndexOf(substr); 
    System.out.println("Last occurrence of"+substr+" is"+ 
               " found at : " + lastIndex); 
  
  } 
}