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
class Exp4Progr4
{
   public static void main(String arr[])
     {
        TrunkCall tc=new Ordinary(3.2f);
	System.out.println("Charges :"+tc.calCharge(10));
	tc=new Lightining(11.3f);
	System.out.println("Charges :"+tc.calCharge(10));
	tc=new Urgent(5.3f);
        System.out.println("Charges :"+tc.calCharge(10));
     }
}