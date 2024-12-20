import java.util.Scanner;

public class Poster_Perimeter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n,m,k;
            n=sc.nextInt();
            m=sc.nextInt();
            k=sc.nextInt();

            int minDifference = Integer.MAX_VALUE;
            for (int l = 1; l <= n; l++) {
                for (int w = 1; w <= m; w++) {
                    int perimeter = 2 * (l + w);
                    int difference = Math.abs(perimeter - k);
                    minDifference = Math.min(minDifference, difference);
                }
            }
            System.out.println(minDifference);

            --t;
        }
        sc.close();
    }
}