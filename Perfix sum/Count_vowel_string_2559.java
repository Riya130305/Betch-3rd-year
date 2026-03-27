import java.util.*;

public class Count_vowel_string_2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        System.out.println("Enter the queries (l r):");
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        int[] result = vowelStrings(words, queries);
        System.out.println("Results:");
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n];
        for (int i = 0; i < n; i++) {
            String s = words[i];
            boolean isValid = isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1));
            if (i == 0) {
                prefix[i] = isValid ? 1 : 0;
            } else {
                prefix[i] = prefix[i - 1] + (isValid ? 1 : 0);
            }
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l == 0) {
                ans[i] = prefix[r];
            } else {
                ans[i] = prefix[r] - prefix[l - 1];
            }
        }
        return ans;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
