import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            int n = s.length();

            int[] left = new int[26];
            int[] right = new int[26];

            int mid = n / 2;
            for (int i = 0; i < mid; i++) {
                left[s.charAt(i) - 'a']++;
            }

            for (int i = (n + 1) / 2; i < n; i++) {
                right[s.charAt(i) - 'a']++;
            }

            boolean lapindrome = true;

            for (int i = 0; i < 26; i++) {
                if (left[i] != right[i]) {
                    lapindrome = false;
                    break;
                }
            }

            System.out.println(lapindrome ? "YES" : "NO");
        }

        sc.close();
    }
}
