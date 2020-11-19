/* 	1
	2 2
	3 3 3
	2 2
	1
*/

class Restaurant
{
public static void main(String[] args)
{
	for(int r=1;r<=9;r++) //1<=3 2<=3
	{
		for(int c=1;c<=r;c++) // 1<=1 2<=1 1<=2 2<=2 3<=2
		{
			System.out.print(r); //		
		}
		System.out.println(" ");
	}
	for(int r=9;r>=1;r--) // 2>=1 
	{
		for(int c=1;c<=r;c++) // 2>=1
		{
			System.out.print(r); //
		}
		System.out.println(" ");
	}
}
}