package trial2;
class Work
{
String name;
int eno;
Work(int eno,String name)
{ 
this.eno=eno;
this.name=name;
}
void show()
{

System.out.println("The Employee number is "+eno);
System.out.println("The Employee name is "+name);
}
}
class DailyWork extends Work
{
int rte;
DailyWork(int eno,String name,int r)
{
super(eno,name);
rte=r;
}
int h=60;
void comPay()
{
System.out.println("Generted Salary : "+rte*h);
}
}
class SalWork extends Work
{
int rte;
SalWork(int eno,String name,int r)
{
super(eno,name);
rte=r;
}
int h=40;
void comPay()
{

System.out.println("Salary : "+rte*h);
}
}

class Ex4Pr3
{
public static void main(String arr[])
{
DailyWork d=new DailyWork(1,"Rishabh",80);
SalWork s=new SalWork(7,"Vibhu",120);
d.show();
d.comPay();
s.show();
s.comPay();

}
}
