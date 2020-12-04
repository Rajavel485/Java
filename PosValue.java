import java.util.Scanner;
class PosValue
{
	public static void main(String[] args)
	{
		int t =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = s.nextInt();
		int []r = new int[n];
		System.out.println("Enter array values");
		for(int i=0; i<r.length; i++)
		{
			r[i] = s.nextInt();
		}
		for(int i=0; i<r.length;i++){
			if(i<r.length-1)
			{
				int a = r[i] - r[i+1];
				t+=Math.abs(a);
			}
		}
		System.out.println("Total" + t);
	}
}