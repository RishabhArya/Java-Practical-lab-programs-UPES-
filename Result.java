package trial2;
import java.util.Scanner;
public class Result {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
Integer marks[] = new Integer[10];
int temp;
System.out.println("Input marks of 10 students");
for(int i=0;i<10;i++){
marks[i]=scan.nextInt();
}
for(int i = 0; i < 10; i++)
{for(int j = 0; j < 10-i-1; j++)
if (marks[j] > marks[j+1])
{
temp = marks[j];
marks[j] = marks[j+1];
marks[j+1] = temp;
}
}
for(int i=0;i<10;i++)
{
if(marks[i]>40 && marks[i]<50) System.out.println(marks[i]+" pass");
else if(marks[i]>50 && marks[i]<75) System.out.println(marks[i]+" merit");
if(marks[i]>75) System.out.println(marks[i]+" distinction");
}
}
}