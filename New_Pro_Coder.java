import java.util.Scanner;

public class New_Pro_Coder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        float half=(float) n/2;
    
        if(m>=half){
            System.out.println("NEWBIE");
        }else{
            System.out.println("PRO");
        }
        sc.close();
    }
}