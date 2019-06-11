abstract class Shape
{
   abstract float ar();  
}
class Circle extends Shape
{
   float a;
   float r;
    Circle(float b)
    {
    r=b;
    }
    @Override
    float ar() 
    {
        a=(22/7)*r*r;
        System.out.println(a);
        return(a);
    }
}
class Rectangle extends Shape
{
     float l;
     float b;
     float a;
     Rectangle(float x, float y)
     {
         l=x;
         b=y;
     }

    
    @Override
    float ar() 
    {
        a=l*b;
                System.out.println(a);
        return(a);
       
    }

}
class q2
{
    public static void main(String args[])
    {
    Circle c = new Circle(4);
     c.ar();
     Rectangle rc =new Rectangle(13,86);
     rc.ar();
    }
}
