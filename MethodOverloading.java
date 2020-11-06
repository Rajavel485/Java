class MethodOverloading
{
public static void main(String[] args)
{
add(2);
add(2,4);
static void add(int i)
{
	System.out.println(i++);
}
static void add(int i, int j)
{
	System.out.println(i+j);
}
}
}