import java.util.Scanner;
import java.util.TreeSet;

public class Minimum_Operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;++i) arr[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(minOperations(arr,k));
        sc.close();
    }
    public static int minOperations(int[] nums, int k) {
        for(int num:nums){
            if(num<k) return -1;
        }
        TreeSet<Integer> distinct = new TreeSet<>((a, b) -> b - a);
        for (int num : nums) {
            if (num > k) {
                distinct.add(num);
            }
        }
        return distinct.size();
    }
}
