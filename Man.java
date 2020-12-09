import java.util.Scanner;
class Man
{
	public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String"); 
	String s1 =s.nextLine();
	String s2 =s.nextLine();
	String s3 =s.nextLine();
	//System.out.println(Funo(st));
	char c[] = s1.toCharArray();
	char c1[] = s2.toCharArray();
	char c2[] = s3.toCharArray();
	
	for(int i=0; i<c.length; i++){
		for(int j=0;j<c1.length;j++){
			for(int k=0; k<c2.length;k++){
				if(c[i]==c1[j] && c1[j]==c2[k] && c2[k]==c[i]){
				System.out.print(c[i]);
				}
			}
		}
	} 
}
}
		