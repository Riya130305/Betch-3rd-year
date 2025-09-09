import java.util.*;
public class fruit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sizze");
        int n=sc.nextInt();
        System.out.println("Input array");
        int[] fruits = new int[n];

        for(int i=0;i<n;i++)
        {
            fruits[i]=sc.nextInt();
        }

        int ans = totalFruit(fruits);
        System.out.println("ans"+" "+ans);
        
    }
    public static int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int max =0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(r<fruits.length)
        {
            if(map.containsKey(fruits[r]))
            {
                map.put(fruits[r],map.get(fruits[r])+1);
            }
            else
            {
                map.put(fruits[r],1);
            }

            if(map.size()>2)
            {
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }

            if(map.size()<=2)
            {
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}