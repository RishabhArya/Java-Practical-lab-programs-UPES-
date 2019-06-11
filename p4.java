package trial2;
import java.util.Scanner;
class p4{
    float result;
    public static void main(String ar[])
    {
       float x,y;
             p4 a = new p4();                       
       Scanner input = new Scanner(System.in);
       x = Integer.parseInt(ar[0]);
       String operator = ar[1];
       y = Integer.parseInt(ar[2]);
       switch(operator)
       {
        case "+":
        a.result = x + y;
        break;
        case "-":
       a. result = x - y;
        break;
        case "*":
        a.result = x * y;
        break;
        case "/":
       a. result = x / y;
        break;
       }  System.out.print("Result:  " +a.result);  } }
 
