import java.util.Scanner;
class Counting
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int len = st.length();
		System.out.println(len);
		int count =0;
		for(int i =0; i<len; i++)
		{
			if(st.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}
}