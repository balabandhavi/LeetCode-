import java.util.Arrays;
import java.util.Scanner;

public class Itz_Simple{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n,k,p;
            n=sc.nextInt();
            k=sc.nextInt();
            p=sc.nextInt();

            int[] a=new int[n];
            int sum=0;
            for(int i=0;i<n;++i) {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            Arrays.sort(a);

            int h_k=k+a[n-1];
            int h_p= p+sum-a[n-1];

            if(h_k > h_p) System.out.println("Ved");
            else if(h_k < h_p) System.out.println("Varun");
            else System.out.println("Equal");
            
            --t;
        }
        sc.close();
    }
}