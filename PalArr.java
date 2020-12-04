import java.util.Scanner;
class PalArr
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String st = s.nextLine();
	char ch[] = st.toCharArray();
	String r[] = st.split(" ");
	String rev =" ";
	for(int i=ch.length-1;i>=0; i--)
	{
		rev = rev + ch[i];
	}
	System.out.println(rev);
	String re[] = rev.split(" ");
	raj:
	for(int i=0;i<r.length; i++)
	{
		for(int j=1;j<re.length; j++)
		{
			if(r[i].equals(re[j]))
			{
			    System.out.println("palindrome is " + " " + r[i]);
				continue raj;
			}
			else {
				System.out.println("not palindrome");
			}
		}
	}
}
}
