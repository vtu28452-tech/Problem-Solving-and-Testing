import java.util.*;

class Result {
    private static int longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 1;

        for (int center = 0; center < n; center++) {
            int l = center, r = center;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--; r++;
            }
            l = center; r = center + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--; r++;
            }
        }
        return maxLen;
    }

    public static List<Integer> circularPalindromes(String s) {
        int n = s.length();
        String doubled = s + s;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String rotation = doubled.substring(i, i + n);
            result.add(longestPalindrome(rotation));
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String s = sc.nextLine().trim();

        List<Integer> result = Result.circularPalindromes(s);
        for (int val : result) {
            System.out.println(val);
        }
    }
}
