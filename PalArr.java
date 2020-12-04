import java.util.Scanner;
class PalArr
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String"); 
	String st = s.nextLine();
	System.out.println("Original string is :" + " " + st);
	char ch[] = st.toCharArray();
	String r[] = st.split(" ");
	String rev =" ";
	for(int i=ch.length-1;i>=0; i--)
	{
		rev = rev + ch[i];
	}
	System.out.println("Rev String : " + " " + rev);
	String re[] = rev.split(" ");
	int flag =0;
	for(int i=0;i<r.length; i++)
	{
		for(int j=1;j<re.length; j++)
		{
			if(r[i].equals(re[j]))
			{
			    flag =1;
				System.out.print(r[i] + " ");
			}
		}
	}
	if(flag == 1)
	{
		System.out.println(" " + "yes Corect");
	}
	else
	{
		System.out.println("Not Corect");
	}
	System.out.println("Successfully executed :" + " " + st);
}
}
