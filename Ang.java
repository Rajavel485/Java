class Ang
{
public static void main(String[] args){
Refered(1);
}
public static void Refered(int n)
{
if(n<=10)
{
	System.out.println(n);
	Refered(n+1);
}
}
}