import java.util.Arrays;
import java.util.Scanner;

public class Bulk_Discount{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a=new int[n];

            for(int i=0;i<n;++i) a[i]=sc.nextInt();
            Arrays.sort(a);
            int cost=0;
            for(int i=0;i<n;++i){
                a[i]=Math.max(0,a[i]-i);
                cost+=a[i];
            }
            System.out.println(cost);
            --t;
        }
        sc.close();
    }
}