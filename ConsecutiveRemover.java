import java.util.*;

public class ConsecutiveRemover {

    // Check if two chars are consecutive in alphabet (circular)
    private static boolean isConsecutive(char a, char b) {
        int diff = Math.abs(a - b);
        return diff == 1 || diff == 25;  // 25 for 'a' <-> 'z' wrap
    }

    public static String removeConsecutivePairs(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && isConsecutive(stack.charAt(len - 1), c)) {
                stack.deleteCharAt(len - 1);  // pop the last char
            } else {
                stack.append(c);  // push current char
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String test = sc.next();
        System.out.println(removeConsecutivePairs(test));  // Test output
        sc.close();
    }
}
