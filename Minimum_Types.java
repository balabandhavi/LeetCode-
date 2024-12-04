
import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Types{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int x=sc.nextInt();

            int[] values=new int[n];
            for(int i=0;i<n;++i) values[i]=sc.nextInt();

            int[] counts=new int[n];
            for(int i=0;i<n;++i) counts[i]=sc.nextInt();
            
            int[] tvalues=new int[n];
            for(int i=0;i<n;++i){
                tvalues[i]=values[i]*counts[i];
            }
            Arrays.sort(tvalues);
            int total=0,count=0;
            for(int i=n-1;i>=0;--i){
                total+=tvalues[i];
                ++count;
                if(total>=x){
                    System.out.println(count);
                    break;
                }
            }
            if(total<x){
                System.out.println(-1);
            }
            --t;
        }
        sc.close();
    }
}

// import java.util.*;
// import java.io.*;

// class Codechef {
//     public static void main(String[] args) throws java.lang.Exception {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int x = sc.nextInt();

//             int[] values = new int[n];
//             int[] counts = new int[n];

//             for (int i = 0; i < n; i++) values[i] = sc.nextInt();
//             for (int i = 0; i < n; i++) counts[i] = sc.nextInt();

//             // Combine value and count into a list of pairs
//             List<int[]> coins = new ArrayList<>();
//             for (int i = 0; i < n; i++) {
//                 coins.add(new int[]{values[i], counts[i]});
//             }

//             // Sort coins by value in descending order
//             coins.sort((a, b) -> Integer.compare(b[0], a[0]));

//             int total = 0;
//             int distinctCount = 0;

//             for (int[] coin : coins) {
//                 int value = coin[0];
//                 int count = coin[1];

//                 total += value * count; // Add all possible contribution from this type
//                 distinctCount++; // Use this coin type

//                 if (total >= x) {
//                     System.out.println(distinctCount);
//                     break;
//                 }
//             }

//             // If we cannot reach or exceed X
//             if (total < x) {
//                 System.out.println(-1);
//             }
//         }
//         sc.close();
//     }
// }
