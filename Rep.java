import java.util.Scanner;
class Rep
{
public static char Funo(String st)
{
	//aabbd
	char c =' ';
	char ch[]= st.toCharArray();
	for(int i=0;i<ch.length;i++){
		for(int j=i+1; j<ch.length;j++){
			if(ch[i]==ch[j]){
				System.out.println(ch[i]);
				//System.out.println(a);
			}
		}
	}
	return c;
}			
		
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String"); 
	String st =s.nextLine();
	System.out.println(Funo(st));
}
}