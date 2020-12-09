import java.util.Scanner;
class Rbg
{
	public static void main(String[] args)
{
	/*Scanner s = new Scanner(System.in);
	System.out.println("Enter the String"); 
	String st =s.nextLine();
	System.out.println(Funo(st));*/
	char []c = {'R', 'B','R','R','G','B','G','B','G'};
	char r = c[0];
	char b = c[1];
	char g = c[4];
	for(int i=0;i<c.length; i++)
	{
		if(r==c[i]){
			System.out.print(c[i] +" ,");
		} //else if(b == c[i]){
			//System.out.print(c[i] +",");
		//} else if(g == c[i]){
			//System.out.print(c[i]);
		//}
	}
	for(int i=0;i<c.length; i++)
	{
		if(b == c[i]){
			System.out.print(c[i] +",");
		} 
	}
	for(int i=0;i<c.length; i++)
	{
		 if(g == c[i]){
			System.out.print(" " +c[i]);
		}
	}
}
}