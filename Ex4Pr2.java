package trial2;
abstract  class Shape
{
	double r1;
	double r2;
	Shape(double r1, double r2)
	{
		this.r1=r1;
		this.r2=r2;
	}
	abstract double area();
	
}
class Rectangle extends Shape
{
	Rectangle (double r1,double r2 )
	{
		super(r1,r2);
	}
	
	double area()
	{
		System.out.println("The Area of rectangle is :");
		return r1*r2;	
	}
}

class Circle extends Shape
{
	Circle (double r1, double r2 )
	{
		super(r1,r2);
	}
	
	double area()
	{
		System.out.println("The Area of circle is :");
		return 3.14*r1*r2;		
	}
}
public class Ex4Pr2 {
    public static void main(String[] args) {		
    Circle c = new Circle(7,5);
    Rectangle r = new Rectangle(2,7);
    System.out.println( c.area());
    System.out.println( r.area());
	}
}

