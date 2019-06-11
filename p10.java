package trial2;
public class p10
{  public static void main(String[] args)
    {  int i,sum=0;
        for(i=41;i<250;i++)
        {
            if(i%5==0)
            { sum = sum + i;
            }
        }System.out.print("SUM : " +sum); } }