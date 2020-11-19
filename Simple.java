import java.io.File;
import java.util.Scanner;
public class Simple
{
public static void main(String args[])
{
int cost, pen;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the price of pen");
cost = sc.nextInt();
System.out.println("Enter the Quantity of pen");
pen = sc.nextInt();
if(cost<5)
{
System.out.println("only above 5 Rs pens are available");
}
else
{
int Total= pen * cost;
System.out.println(pen + "pen Rupees" + "=" + Total);
}
}
}