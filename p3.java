package trial2;
import java.util.Scanner;
class p3 {
 public static void main(String[] args)
 {
                    Scanner input = new Scanner(System.in);
  System.out.println("Enter value of n");
  int n = input.nextInt();
  int i,first = 0, second = 1, next;
         System.out.println("Fibonacci series  ");
                 for(i=0;i<n;i++)
{                    if(i<=1)
    next = i;  else  {next = first + second;
                                     first = second;
                                     second = next;  }
 System.out.println(next); } } }
 