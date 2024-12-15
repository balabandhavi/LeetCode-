import java.util.Scanner;

public class buttonWithLongestTime {
    public static int sol(int[][] events) {
        
        int time=events[0][1];
        int index=events[0][0];

        for(int i=1;i<events.length;++i){
            int dif=events[i][1]-events[i-1][1];
            if(dif>time){
                time=dif;
                index=events[i][0];
            }else if(dif==time && events[i][0]<index){
                index=events[i][0];
            }
        }

        return index;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] a =new int[n][2];

        for(int i=0;i<n;++i){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        System.out.println(sol(a));
        sc.close();
    }
}
