class Employee
{
	String Ename;
	int Esal;
	int Eid;
	Employee(String name,int sal,int id)
	{
		Ename=name;
		Esal=sal;
		Eid=id;
	}
	void show()
	{
		System.out.println("Name of employee:-"+Ename);
		System.out.println("Salary of employee:-"+Esal);	
	}
	void increaseSal(float percentage)
	{
	    float Increasedsalary=((percentage*Esal)/100+Esal);
	    System.out.println("Increased salary:-"+Increasedsalary);
	}
}
class Department
{
	String depname;
	Department(String dname)
	{
		depname=dname;
	}
}
class Manager extends Employee
{
	Department dep;
	Manager(String name,int sal,int id,Department dp)
	{
		super(name,sal,id);
		dep=dp;
	}
	void departmentdetais()
	{
		System.out.println("Department name:-"+dep.depname);
	}
}
public class Q5
{
	public static void main(String args[])
	{
		Department d=new Department("CIT");
		Manager man=new Manager("Rishabh",99999,12345,d);
		man.show();
		man.departmentdetais();
		man.increaseSal(5);
	}
}

