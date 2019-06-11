package trial2;
import java.util.Scanner;
class Month
{
   String  month;
   int m;
   Scanner input = new Scanner(System.in);
   int _input() {
   System.out.println("Enter a number");
    m = input.nextInt(); 
   return m; }
  void printf()
{ switch(m)
      {
       case 1:
       month = "JANUARY"; 
       break;    case 2:   month = "FEBRUARY";  break;
       case 3:
       month = "MARCH";
       break;  case 4: month = "APRIL"; break;
       case 5:
       month = "MAY";
       break; case 6:  month = "JUNE"; break;
       case 7:
       month = "JULY";
       break;case 8:month = "AUGUST";break;
       case 9:
       month = "SEPTEMBER";
       break;
       case 10:
       month = "OCTOBER";
       break; case 11:  month = "NOVEMBER"; break;
       case 12:
       month = "DECEMBER";
       break;
       } 
System.out.print(" NAME OF THE MONTH IS : " +month); } }
public class p9{
public static void main(String args[])
{ Month p = new Month();
p._input();
p.printf(); }
}

