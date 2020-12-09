import java.util.Scanner;
class StArr 
{
	public static void main(String[] args)
	{
		/*Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String []arr = new String[n];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = sc.nextLine();
		} */
		String s = "1,2,3,4";
		String s1 = "2,3,5,8";
		String ans = "";
		for(String c: s.split(","))
				for(String ch:s1.split(","))
					if(c.equals(ch))
					{
						ans = ans + c;
					}
				System.out.println(ans);
	}
}