class MultiOfThree{
public static void main(String[] args){
for(int i=0;i<=50;i++)
{
	if(i%3==0 && i%5==0)
	continue;
	else if(i%3==0)
	 System.out.println(i);
}
}