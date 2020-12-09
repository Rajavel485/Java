import java.util.Scanner;
class Seperate
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int length = st.length();
		for(int i=0; i<length;i++)
		{
			System.out.println(st.charAt(i));
		}
	}
}
		