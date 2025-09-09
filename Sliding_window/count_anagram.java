import java.util.*;

public class count_anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("s1");
        String s1 = sc.next();

        System.out.println("s2");
        String s2 = sc.next();

        int result = anagram(s1, s2);
        System.out.println("result " + result);
    }

    public static int anagram(String s1, String s2) {
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        int pl = s2.length();
        int count = 0;

        for (int i = 0; i < pl; i++) {
            map1.put(s2.charAt(i), map1.getOrDefault(s2.charAt(i), 0) + 1);
        }

        TreeMap<Character, Integer> map2 = new TreeMap<>();
        int t = s1.length();

        for (int i = 0; i < pl; i++) {
            map2.put(s1.charAt(i), map2.getOrDefault(s1.charAt(i), 0) + 1);
        }

        if (map1.equals(map2)) {
            count++;
        }

        for (int i = pl; i < t; i++) {
            char ch = s1.charAt(i - pl);
            if (map2.get(ch) == 1) {
                map2.remove(ch);
            } else {
                map2.put(ch, map2.get(ch) - 1);
            }

            map2.put(s1.charAt(i), map2.getOrDefault(s1.charAt(i), 0) + 1);

            if (map1.equals(map2)) {
                count++;
            }
        }
        return count;
    }
}
