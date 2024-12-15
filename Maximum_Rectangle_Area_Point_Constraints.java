import java.util.HashMap;
import java.util.Scanner;

public class Maximum_Rectangle_Area_Point_Constraints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] points=new int[n][2];

        for(int i=0;i<n;++i) for(int j=0;j<2;++j) points[i][j]=sc.nextInt();

        System.out.println(maxRectangleArea(points));

        sc.close();
        
    }
    
    public static int maxRectangleArea(int[][] points) {
        int area=0;
        HashMap<Integer,Integer> y=new HashMap<>();
        HashMap<Integer,Integer> x=new HashMap<>();

        for(int i=0;i<points.length;++i){
            y.put(points[i][1], y.getOrDefault(points[i][1], 0)+1);
        }
        for(int i=0;i<points.length;++i){
            x.put(points[i][0], x.getOrDefault(points[i][0], 0)+1);
        }
        
        return area;
    }
}
