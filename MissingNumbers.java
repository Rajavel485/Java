public class MissingNumbers{
static int missing(int a[], int n)
{
 int total = (n+1)*(n+2)/2;
 for(int i=0; i<n; i++)
 {
	total-=a[i];
	return total;
	}
}
public static void main(String[] args){
	int a[]={2, 3, 4, 6, 7,8};
	int m= missing(a, 5);
	System.out.println(m);
	}
}