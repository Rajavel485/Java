import java.util.Scanner;
class Facto
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int st = s.nextInt();
	int i, fact=1;;
	for(i=1; i<=st;i++)
	{
	    fact = fact * i;
		//System.out.println(fact);
	}
	
	System.out.println(fact);
	}
}