import java.util.Scanner;
class Pal
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int st = s.nextInt();
	int temp =st;
	int rem=0;
	for(int i=0;i<st; i++)
	{
		int a = st%10;
		rem = rem*10+a;
		st = st/10;
	}
	if(temp == rem)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
   }
}