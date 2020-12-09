import java.util.Scanner;
class NumFind
{
public static String Funo(int num1, int num2)
{
	String b ="";
	if(num1==num2){
		b="false";
	}
	else if(num2>num1) 
	{
		b = "true";
	}
	else{ 
		b ="-1";
	}
	
	return b;
}			
		
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String"); 
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	System.out.println(Funo(num1, num2));
}
}