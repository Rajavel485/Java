class A{
A()
{
 this(5);
 System.out.println("hi");
 }
 A(int x){
 this(10,20);
 System.out.println(x);
 }
 A(int x, int y){
 System.out.println(x+y);
 }
 }
 public class KeywordIn
{
public static void main(String[] args)
{
 A a = new A();
 }
 }