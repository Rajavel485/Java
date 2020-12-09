class StArrs
{
	public static void main(String[] args)
	{
		/*Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String []arr = new String[n];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = sc.nextLine();
		} */
		String s = "rajavel";
		String s1 = "gokulra";
		String ans = "";
		for(String c: s.split(""))
				for(String ch:s1.split(""))
					if(c.equals(ch))
					{
						ans = ans + c;
					}
				System.out.println(ans);
	}
}