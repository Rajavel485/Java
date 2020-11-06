class Conversions
{
 public static void main(String[] args)
 {
 String x="10";
 String y="20";
 try{
 int i = Integer.parseInt(x.trim());
 int j = Integer.parseInt(y.trim());
 System.out.println(i+j);
 }
 catch(NumberFormatException e){
 System.out.println("NumberFormatException");
 }
 }
 }