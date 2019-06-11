/* custom exception -- create custom exception,input number as a sting--->number to digits -->sum
 *value to odd or even --->check ,if odd throws manual exception from class odd custom exception 
 *class should be an anonymous class*/
import java.util.Scanner;
public class CustomeException extends Exception
{
	
}
public class test {
	public static void main(String[] args) {
	    System.out.println("Please Enter The string");
		Scanner string=new Scanner(System.in);
		String str1=string.nextLine();
		int sum=0;
		int num = Integer.parseInt(str1);
	    int count[] =new int[str1.length()];
	    for(int i=0;i<str1.length();i++)
	    {
	    	sum=sum+num%10;
	    	num=num/10;
	    }
	    try {
	    	if(sum%10==0) {
	    		System.out.println("Sum is Even");}
	    	else {
				throw new Exception E = new Excption() {
					void msg() {
						System.out.println("Odd Number");
					}
				};
	    	}
	    }
	    catch(CustomeException d){
	    }
	}

}
