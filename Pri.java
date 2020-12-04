import java.util.Scanner;
class Pri
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	boolean r =false;
	for(int i=2; i<t;i++)
	{
		if(t%i==0)
		{
			r=true;
		}
	}		
	if(r==false)
	{
		System.out.println("prime");
	}
	else 
		System.out.println("not prime");
}
}