import java.util.Scanner;
interface calculator
{ 
    float sum(int a,int b);
    float sub(int c,int d);
    float div(int e,int f);
    float mul(int g,int h);
} 
  
class operation implements calculator 
{ 
    public float sum(int a,int b) 
    { 
        return a+b; 
    }
    public float sub(int c,int d) 
    { 
       return c-d; 
    } 
    public float mul(int g,int h ) 
    { 
        return g*h; 
    } 
    public float div(int e,int f) 
    { 
        return e/f; 
    } 
}
public class Exp5pr2 {
    public static void main (String[] args) 
    { 
        int num1,num2,op;
        Scanner input= new Scanner(System.in);
        operation a = new operation();
        System.out.println("Enter the number one");
    	num1= input.nextInt();
    	System.out.println("Enter the number two");
       	num2= input.nextInt();
    	System.out.println("value of add"+a.sum(num1,num2));
    	System.out.println("value of sub"+a.sub(num1,num2));
    	System.out.println("value of mul"+a.mul(num1,num2));
    	System.out.println("value of div"+a.div(num1,num2));         
    } 
}

