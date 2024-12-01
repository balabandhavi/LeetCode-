import java.util.Scanner;

public class smallestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bits = Integer.toBinaryString(n).length();
        int allSet = (1 << bits) - 1;
        if (allSet < n) {
            bits++;
            allSet = (1 << bits) - 1;
        }
        System.out.println(allSet);
        sc.close();
    }
}