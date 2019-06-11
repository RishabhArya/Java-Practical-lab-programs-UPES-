class Rishabh{
	int age=20;
	protected int id=500062003;
	private int sal=1500;
}
public class Q1 extends Rishabh  {
	 public static void main(String args[]){  
		   Rishabh r=new Rishabh();  
		   System.out.println("Age is:"+r.age);  
		   System.out.println("Name is:"+r.sal);
		   System.out.println("Name is:"+r.id);
		}  
}