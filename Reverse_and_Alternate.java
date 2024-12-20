import java.util.Scanner;

public class Reverse_and_Alternate{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            String S = sc.next(); // Binary string
            int N = S.length();

            // Identify adjacent violations
            int first = -1, last = -1;
            int violations = 0;

            for (int i = 0; i < N - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    violations++;
                    if (first == -1) first = i;
                    last = i + 1;
                }
            }

            // Case 1: Already alternating
            if (violations == 0) {
                System.out.println("YES");
                continue;
            }

            // Case 2: More than two violations, not possible
            if (violations > 2) {
                System.out.println("NO");
                continue;
            }

            // Case 3: Exactly two violations
            // Check if reversing [first, last] fixes the string
            boolean canFix = true;

            for (int i = first; i < last; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    canFix = false;
                    break;
                }
            }

            if (canFix) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}