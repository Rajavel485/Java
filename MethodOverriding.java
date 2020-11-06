class a
{
void display()
{
	System.out.println("HI Rohit");
}
}
class b extends a
{
void display()
{
	System.out.println("HI");
}
public class MethodOverriding
{
	public static void main(String[] args)
	{
		b obj = new b();
		b.display();
	}
}
