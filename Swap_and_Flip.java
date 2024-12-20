
import java.util.Scanner;

public class Swap_and_Flip{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();  
            String S,T;
            S=sc.next();
            T=sc.next();


            int count0S = 0, count1S = 0;
            int count0T = 0, count1T = 0;
    
            for (char c : S.toCharArray()) {
                if (c == '0') count0S++;
                else count1S++;
            }

            for (char c : T.toCharArray()) {
                if (c == '0') count0T++;
                else count1T++;
            }


            if(n%2==0){
                int count0 = count0S+count0T;
                //int count1 = count1S+count1T;
                if(count0%2==0 || S.equals(T)) System.out.println("YES");
                else System.out.println("NO");
            }else{
                 if(count1S%2==0) System.out.println("YES");
                else System.out.println("NO");
            }
             
            --t;
        }
        sc.close();
    }
}