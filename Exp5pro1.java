import java.util.Scanner;
interface test 
{  
    void square(int a); 
} 
  
class arit implements test 
{ 
    public void square(int a) 
    { 
        System.out.println("Square of Number is"+a*a); 
    } 
}
public class Exp5pro1 
{
    public static void main (String[] args) 
    { 
        int num;
    	System.out.println("Enter the number you wish to calculate square of");
        Scanner input= new Scanner(System.in);
        num= input.nextInt();
    	arit a = new arit(); 
        a.square(num);  
    } 
}
