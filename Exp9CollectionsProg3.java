import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Studentt{  
	  String name;
	} 
public class Exp9CollectionsProg3
{
	private static Scanner in;
	private static int search;
	public static void main(String args[]){  
	 //Creating user-defined class objects  
	  in = new Scanner(System.in);
	  ArrayList<Studentt> al=new ArrayList<Studentt>(); 
	  for(int i=0;i<5;i++)
      {
   	   System.out.println("Enter Student Name");
   	   String st1 = in.next();
	   Studentt s = new Studentt();
	   s.name= st1; 
	   al.add(s);
      }
	  Set<Studentt> hSet = new HashSet<Studentt>(); 
      for (Studentt x : al) 
      {
    	  hSet.add(x); 
      }
      String search = in.next();
      System.out.println("Enter the name to search");
      boolean flag;
      flag=hSet.contains(search);
      if(flag==true)
      {
    	  System.out.println("Name is found");
      }
      else
      {
    	  System.out.println("Name is not found");
      }
	}	  
}	