import java.util.ArrayList;
import java.util.Scanner; 
import java.util.ListIterator; 
//Read all elements from ArrayList by using Iterator.
//Create duplicate object of an ArrayList instance.
//Reverse ArrayList content.
class Student{  
	  String name; 
	  int rollno;  
	  int age;  
	  public String toString() { 
	        return String.format(rollno+" "+name+" "+age); 
	    } 
	} 
public class Exp9CollectionsProg1 
{
	private static Scanner in;
	static void main(String args[]){  
	 //Creating user-defined class objects  
	  in = new Scanner(System.in);
	  ArrayList<Student> al=new ArrayList<Student>(); 
	  for(int i=0;i<3;i++)
      {
   	   System.out.println("Enter Student Name,rollno,age");
   	   String st1 = in.next();
	   int st2 = in.nextInt();
	   int st3 = in.nextInt();
	   Student s = new Student();
	   s.name= st1;s.rollno= st2;s.age= st3; 
	   al.add(s);
      }
      //Getting Iterator  
      ListIterator<Student> itr = al.listIterator();  
	  //traversing elements of ArrayList object forward 
	  while(itr.hasNext())
	  {  
		Student st=(Student)itr.next();  
		System.out.println(st);  
	  }  
	//traversing elements of ArrayList object reverse
	  System.out.println("In Reverse Order");
	  while (itr.hasPrevious()) {  
		  Student st=(Student)itr.previous();  
  		  System.out.println(st); 
   }  
	}  
	
}