import java.util.Scanner;
class WorReverse
{
	public static void main(String[] main)
	{
		Scanner s = new Scanner(System.in);
		//String str = " hi how are you";
		String str = s.nextLine();
		String a[] = str.split(" ");
		String rev =" ";
		for(int i=a.length-1; i>=0;i--)
		{
			rev = rev + a[i]+" ";
		}
		System.out.println(rev);
	}
}