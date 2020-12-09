class StAr
{
	public static void main(String[] args)
	{
		String s = "Rajvel";
		//String s1 = "Rajvel";
		String s1 = "";
		String s2 ="";
		for(int i=0; i<s.length(); i++)
		{
			s1 = s1+s.charAt(i);
			System.out.println(s1);
		}
		for(int j=s.length()-1;j>0;j--)
		{
			s2 = s2 + s.charAt(j);
			System.out.println(s2);
		}
	
		/*String ans = "";
		for(String c: s.split(","))
				for(String ch:s1.split(","))
					if(c.equals(ch))
					{
						ans = ans + c;
					}*/
	}
}