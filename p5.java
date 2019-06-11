package trial2;

class A
{
 void  swap( int a , int b  ){
    int c;
    System.out.println("Numbers Before Swapping : " +a +" " +b);
    c = a;  a = b; b = c;
     System.out.println("Numbers After Swapping :" + a + " " + b);
} }
public class p5{
  public static void main(String args[])
{ A o = new A();
  o.swap(4,5); } }
 