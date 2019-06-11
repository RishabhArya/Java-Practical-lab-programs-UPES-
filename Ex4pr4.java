package trial2;
import java.util.Scanner;
class TrunkCall
{
  float rate;
	TrunkCall(float r)
	{
		rate=r;
	}
  float calCharge(int m)
	{
		return (float) rate*m;
	}  
}
class Urgent extends TrunkCall
{
	Urgent(float r)
	{
		super(r);
	}
}
class Ordinary extends TrunkCall
{
	Ordinary(float r)
	{
		super(r);
	}
}
class Lightining extends TrunkCall
{
	Lightining(float r)
	{
		super(r);
	}
}
class Ex4pr4
{
   public static void main(String arr[])
     {
        TrunkCall tc=new Ordinary(2.7f);
	System.out.println("Charges :"+tc.calCharge(10));
	tc=new Lightining(14.6f);
	System.out.println("Charges :"+tc.calCharge(10));
	tc=new Urgent(4.9f);
        System.out.println("Charges :"+tc.calCharge(10));
     }
}