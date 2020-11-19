import java.util.Scanner;
class Reverse
{
	public static void main(String[] main)
	{
		Scanner s = new Scanner(System.in);
		//String str = " hi how are you";
		String str = s.nextLine();
		String rev ="";
		for(int i=str.length()-1; i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}