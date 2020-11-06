public class GreatestNumbersN
{
public static void main(String args[])
{
      int a[] = new int[n]
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the size of n:");
      n = scanner.nextInt();
	  System.out.println("Enter the values:");
	  for(int i=0;i<n;i++)
	  {
		int a[i]= scanner.nextInt();
	  }
	 int lar = a[0];
	 for(int i=0;i<n;i++){
	    if(lar>a[i]){
			lar= a[i];
		}
	}
	System.out.println(lar);
}
}