import java.io.*;
import java.util.*;

class Result {

    public static String twoStrings(String s1, String s2) {

        boolean[] letters = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (letters[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }
}
public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH"))
            );

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {

            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
