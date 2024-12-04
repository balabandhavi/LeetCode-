import java.util.Scanner;

public class Binary_Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(((n/2)==k) || ((n%2)+(n/2))==k) System.out.println("YES");
            else System.out.println("NO");
            --t;
        }
        sc.close();
    }
}