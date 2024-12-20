import java.util.Scanner;

public class Stable_Array{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;++i) a[i]=sc.nextInt();
            // int seconds = 0;
            // while (true) {
            //     boolean changed = false; 
            //     int[] temp = a.clone(); 

            //     for (int i = 0; i < n - 1; i++) {
            //         if (a[i] < a[i + 1]) {
            //             temp[i] = a[i + 1]; 
            //             changed = true;
            //         }
            //     }
            //     a = temp;
            //     if (!changed) {
            //         break; 
            //     }
            //     seconds++;
            // }
            // System.out.println(seconds);
            

            boolean isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                // If sorted, no time is needed
                System.out.println(0);
            } else {
                // Find the largest and smallest elements
                int min = a[0], max = a[0];
                for (int i = 1; i < n; i++) {
                    min = Math.min(min, a[i]);
                    max = Math.max(max, a[i]);
                }

                // The time to stabilize is max - min
                System.out.println(max - min);
            }
            --t;
        }
        sc.close();
    }

    // private static void swap(int i,int j,int[] a){
    //     int temp=a[i];
    //     a[i]=a[j];
    //     a[j]=temp;
    // }
}