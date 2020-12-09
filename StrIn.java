import java.util.Scanner;
class StrIn
{
	public static void main(String[] args)
{
	String st = "8965734";
	char s[] = st.toCharArray();
	//System.out.println(s[0]);
	char l = s[0];
	char sm =' ';
	char small = s[0];
	char lar =' ';
	for(int i=0; i<s.length;i++){
		if(l<s[i]){
			sm = s[i];
		} else if(s[i]<small){
			lar = s[i];
		}
	}
	System.out.println("large = " + sm + " " + "small =" + lar);
}
}
	