class a 
{
a()
{
	System.out.println("a");
}
a(int i)
{
	System.out.println(i);
}
}
class b extends a
{
b()
{
	System.out.println("a");
}
b(int i)
{
	super(i);
	System.out.println(i);
}
}
public class SuperKeyword
{
	public static void main(String[] args)
	{
		b o = new b();
	}
}	