import java.io.File;
import java.util.Scanner;

class SwitchCase
{
Scanner s = new Scanner(System.in);
String str = s.nextLIne();

public static void main(String[] args)
{
switch(str)
{
case "Raja"
	System.out.println("HI Raja");
	break;
case "Rohit"
	System.out.println("HI Rohit");
	break;
case "Sharma"
	System.out.println("HI Sharma");
	break;
case "Vel"
	System.out.println("HI Vel");
	break;
default
	System.out.println("Enter Valid name");
}
}
}