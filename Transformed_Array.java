import java.util.Scanner;

public class Transformed_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;++i) arr[i]=sc.nextInt();

        int[] result=constructTransformedArray(arr);

        for(int i=0;i<n;++i) System.out.print(result[i]+" ");
        sc.close();
    }

    public static int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;++i){
            if(nums[i]==0) result[i]=nums[i];

            if(nums[i]>0){
                int index=(i+nums[i])%n;
                result[i]=nums[index];
            }
            else{
                int x=Math.abs(nums[i])%n;
                int index=(n-x+i)%n;
                result[i]=nums[index];
            }
        }
        return result;
    }
    
}
