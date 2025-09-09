// package 424. Longest Repeating Character Replacement;
import java.util.*;
public class brute_fr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a size");
        // int n=sc.nextInt();
        System.out.println("Enter k value");
        int k= sc.nextInt();
        System.out.println("Input String");
        String s=sc.next();

        int ans= characterReplacement(s,k);
        System.out.println("ans"+" "+ans);
    }
     public static int characterReplacement(String s, int k) {
       int max =0;
        for(int i=0;i<s.length();i++)
        {
            int[] hash=new int[26];
            int maxf=0;
           
            for(int j=i;j<s.length();j++)
            {
                hash[s.charAt(j)-'A']++;
                maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
                int change=(j-i+1)-maxf;
                if(change<=k)
                {
                    max=Math.max(max,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        return max;
    }
}

