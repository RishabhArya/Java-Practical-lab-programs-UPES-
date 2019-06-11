package trial2;
import java.util.Scanner;
public class practice {
public static void main(String args[])
{	
Scanner input = new Scanner(System.in);
System.out.print("Enter 3 nos: ");
int n1 = input.nextInt();
int n2 = input.nextInt();
int n3 = input.nextInt();
System.out.println("Three numbers are : " +n1 + "," + n2 + "," +n3);
if(n1>n2&&n1>n3) {
System.out.print("THE LARGEST NUMBER IS: " +n1); }
else if(n2>n1&&n2>n3) {
System.out.print("THE LARGEST NUMBER IS: " +n2); }
else 
System.out.print("THE LARGEST NUMBER IS: " +n3); 
} }