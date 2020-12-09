import java.util.Scanner;
import java.util.Arrays;
class Smll
{
 public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     int n =s.nextInt();
     int []l = new int[n];
     for(int i=0;i<n;i++){
        l[i] = s.nextInt();
     }
     int lar =l[0];
     int small= l[1];
     for(int i=0; i<n;i++){
         if(l[i]>lar){
             lar =l[i];
         }
         if(l[i]<small){
             small=l[i];
         }
         
     }
     System.out.println(small + "  " + lar);
    }
}
     