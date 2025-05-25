import java.util.*;

class Find_Minimum_Log_Transportation {
    public long minCuttingCost(int n, int m, int k) {
        long cost=0;

        if(n>k){
            int len1=n-k;

            cost+=(1L*len1*k);
        }

        if(m>k){
            int len1=m-k;

            cost+=(1L*len1*k);
        }

        return cost;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        Find_Minimum_Log_Transportation obj = new Find_Minimum_Log_Transportation();

        System.out.println(obj.minCuttingCost(n, m, k));

        sc.close();
    }
}
