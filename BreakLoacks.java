
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BreakLoacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;++i) arr.add(sc.nextInt());
        int k=sc.nextInt();
        System.out.println(findMinimumTime(arr,k));
        sc.close();
    }
    public static int findMinimumTime(List<Integer> strength, int K) {
        Collections.sort(strength);
        
        int time = 0;
        int factor = 1; 
        int currentStrength = 0;

        for (int lock : strength) { 
            while (currentStrength < lock) {
                currentStrength += factor;
                time++;
            }
            System.out.print(time+" "+currentStrength+" ");
            currentStrength = 0;
            factor += K;
            System.out.print(factor);
            System.out.println();
        }

        return time;
    }
}
