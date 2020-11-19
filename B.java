import java.util.Scanner;
class B
{
	public static void main(String[] args)
	{
		int Dosa =20, idly=5, parotta=10;
		int total =0;
		do
		{
			Scanner s = new Scanner(System.in);
			System.out.println(" 1. Dosa RS" + Dosa);
			System.out.println(" 2. idly Rs"+ idly);
			System.out.println(" 3. parotta" + parotta);
			System.out.println("4 Quit");
			int ch = s.nextInt();
			switch(ch)
			{
				case 1: 
					total+=Dosa;
					break;
				case 2:
					total+=idly;
					break;
				case 3:
					total+=parotta;
					break;					
				default:
					System.out.println("invalid");
			}
		}while(ch!=4);
			System.out.println(total);
	}
}