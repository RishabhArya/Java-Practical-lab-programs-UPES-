import java.util.*;
class Emp implements Comparable<Emp>
{
  String name;
  String depart;
  int age;
  double sal;
  Emp(String name,int  age, double sal, String dep, String depart)
  {
	this.name = name;
	this.age = age;
	this.sal = sal;
	this.depart = depart;	    
  }
	public int compareTo(Emp arg0) {
		return this.age-arg0.age;
	}
}
public class employees {
	private static Scanner in;
	public static void main(String[] args) {
	   in = new Scanner(System.in);
       ArrayList<Emp> list1 = new ArrayList<Emp>();
       ArrayList<Emp> list2 = new ArrayList<Emp>();
       ArrayList<Emp> list3 = new ArrayList<Emp>();
       ArrayList<Emp> list4 = new ArrayList<Emp>();
       for(int i=0;i<5;i++)
       {
    	   System.out.println("Enter Employee Name,Age,Salary");
    	   String s1 = in.next();
    	   int s2 = in.nextInt();
    	   double s3 = in.nextDouble();
    	   System.out.println("Select department--- Press 1 for IT department, 2 for ACCOUNT department, 3 for Security department");
    	   int j = in.nextInt();
    	   String s4 = null;
    	   switch (j) 
   	       {
   	       	case 1:
   	    	{
   	    		s4 = "IT";
   	    		break;
   	    	}
   	       	case 2:
   	    	{
   	    		s4 = "ACCOUNT";
   	    		break;
   	    	}
   	       	case 3:
   	    	{
   	    		s4 = "SECURITY";
   	    		break;
   	    	}
   	    }
    	   list1.add(new Emp(s1,s2,s3,s4, s4));
       }
        for(Emp x: list1)
       {
    	  if(x.depart=="IT")
    	  {
    		  list2.add(new Emp(x.name,x.age,x.sal,x.depart, null)) ;
    	  }
    	  if(x.depart=="ACCOUNT")
    	  {
    		  list3.add(new Emp(x.name,x.age,x.sal,x.depart, null)) ;
    	  }
    	  if(x.depart=="SECURITY")
    	  {
    		  list4.add(new Emp(x.name,x.age,x.sal,x.depart, null)) ;
    	  }
       }
       Collections.sort(list2);
       System.out.println("Employees in IT department are:-");
       for(Emp x: list2)
		{
			System.out.println("Name: "+ x.name+" "+"Age: "+ x.age+" "+"Sal: "+ x.sal);
			
		}
       System.out.println("\n");
       Collections.sort(list3);
       System.out.println("Employees in ACCOUNT department are:-");
       for(Emp x: list3)
		{
			System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
			
		}
       System.out.println("\n");
       Collections.sort(list4);
       System.out.println("Employees of SECURITY department");
       for(Emp x: list4)
       {
			System.out.println("Name: "+ x.name+" "+" Age: "+ x.age+" "+" Sal: "+ x.sal);
       }	
	}
}

