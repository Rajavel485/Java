interface A
{
	void show();
}
class Lambda{
public static void main(String[] args)
{
	A a=()-> System.out.println("hi");
}
}