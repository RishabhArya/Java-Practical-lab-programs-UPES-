import java.util.*;
import java.util.Scanner;
class counting
{	
     void frequencycountinger(ArrayList<String> l)
     {
        HashSet<String> h1 = new HashSet<String>();
        h1.addAll(l);
        int counting =0;
        Iterator<String> itr = h1.iterator();
        while(itr.hasNext())
        {
        	counting =0;
  	        String s2 = itr.next();
  	        for(int j =0;j<l.size();j++)
  	        {
  	        	if(l.get(j).equals(s2))
  		        {
  	        		counting++; 
  		        }
  	     }
  	    System.out.println(s2+" "+counting);          }
	 }
}
public class frequency {
	private static Scanner in;
	public static void main(String[] args) {
	  in = new Scanner(System.in);
      System.out.println("Enter your first paragraph");
      String sf = in.nextLine().toLowerCase();
      System.out.println("Enter your Second paragraph");
      String ss = in.nextLine().toLowerCase();
      ArrayList<String> lf = new ArrayList<String>(Arrays.asList(sf.split(" ")));
      ArrayList<String> ls = new ArrayList<String>(Arrays.asList(ss.split(" ")));
      counting c1 = new counting();
      System.out.println("Words frequency in the first paragraph");
      c1.frequencycountinger(lf);
      System.out.println("Words frequency in the Second paragraph");
      c1.frequencycountinger(ls);
      lf.retainAll(ls);
      if(lf.isEmpty())
      {
    	  System.out.println("No words in comman");
      }
      else 
      {
    	  System.out.println("Common words from both the  paragraph: "+ lf);
      }
}}