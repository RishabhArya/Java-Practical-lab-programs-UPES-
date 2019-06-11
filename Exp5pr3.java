import java.util.Scanner;
interface Shape
{
	final double PI=3.14;
}
class Circle implements Shape

{
	double Area(int d)
	{
		return PI*d*d;	
	} 
}
	
class Exp5Pr3 {
	public static void main(String[] args) {
		Circle C=new Circle();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the diameter");
		int num= input.nextInt();
		System.out.println("Area of Circle is"+C.Area(num));
	}
	
}
