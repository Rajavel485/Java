import java.util.Scanner;
class CopyRev
{
	public static void main(String[] args)
	{
		int []r = {3, 2, 4, 6, 1};
		int []s = new int[5];
		for(int i=0; i<r.length; i++)
		{
				s[i] = r[i]; 
		}
		for(int t:s){
			System.out.println(t);
		}
	}
}