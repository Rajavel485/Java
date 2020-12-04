import java.util.Scanner;
class Fib
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int st = s.nextInt();
	int n1 =0, n2 =1;
	System.out.println(n1 +"\n" + n2);
	for(int i=0; i<st; i++)
	{
		int n3 = n1 + n2;
		System.out.println(n3);
		n1 = n2;
		n2 =n3;
	}
	}
}