import java.util.*;
public class Brute_ff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Input the string");
        String s=sc.next();
        int answer=longestkSubstr(s,k);
        System.out.println("answer"+" "+answer);
    }

    public static int longestkSubstr(String s, int k) {
        // code here
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            HashMap<Character,Integer> map= new HashMap<>();
            for(int j=i; j<s.length();j++)
            {
                if(map.containsKey(s.charAt(j)))
                {
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                }
                else 
                {
                    map.put(s.charAt(j),1);
                }
                if(map.size()>k)
                break;
                if(map.size()==k)
                max =Math.max(max,(j-i+1));
            }   
           if(max==0)
            return -1;
        }
        return max;
        
    }
}
