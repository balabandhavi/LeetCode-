// import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

public class Nice_Array{
    // public static boolean isNiceArray(int[] A, int K, int index, int currentSum, Map<String, Boolean> memo) {
    //     if (index == A.length) {
    //         return currentSum == 0;
    //     }
    //     String key = index + "," + currentSum;
    //     if (memo.containsKey(key)) {
    //         return memo.get(key);
    //     }
    //     int floorValue = (int) Math.floor((double) A[index] / K);
    //     int ceilValue = (int) Math.ceil((double) A[index] / K);
    //     boolean result = false;
    //     if (isNiceArray(A, K, index + 1, currentSum + floorValue, memo)) {
    //         result = true;
    //     } else if (isNiceArray(A, K, index + 1, currentSum + ceilValue, memo)) {
    //         result = true;
    //     }

    //     memo.put(key, result); 
    //     return result;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t> 0) {
            int N = sc.nextInt(); 
            int K = sc.nextInt(); 
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int minSum = 0, maxSum = 0;

            for (int i = 0; i < N; i++) {
                int floorValue = (int) Math.floor((double) A[i] / K);
                int ceilValue = (int) Math.ceil((double) A[i] / K);
                minSum += floorValue;
                maxSum += ceilValue;
            }
            if (minSum <= 0 && maxSum >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            --t;
        }
        sc.close();
    }
}