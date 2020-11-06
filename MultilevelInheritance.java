class add
{
}
add(int i, int j)
{
	System.out.println(i+j);
}
public void run();
{
	System.out.println("add");
}
class sub extends add
{
}
void run2();
{
	System.out.println("sub");
}
class mul extends sub
{
}
void run3();
{
	System.out.println("mul");
}
public class MultilevelInheritance 
{
	public static void main(String[] args)
	{
		sub s = new sub();
		s.run();
		s.run2();
	}