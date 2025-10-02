import java.util.*;
public class Shop_in_candy_store {
    public static void main(String[] args) {
        int[] price={1,2,7,4,8,1};
        int k=2;
        //ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> ans = minMaxCandy(price,k);
        System.out.println(ans);
        // for(int i=0;i<ans.size();i++)
        // {
        //     System.out.println("ans "+res.add(ans.get(i)));
        // }
    }
    public static ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sumS=0;
        int sumL=0;
        int i=0;
        int j=prices.length-1;
        Arrays.sort(prices);
        // Find min element
        while(i<=j)
        {
            sumS+=prices[i];
            i++;
            j=j-k;
        }
        arr.add(sumS);
        i=0;
        j=prices.length-1;
        while(i<=j)
        {
            sumL+=prices[j];
            i+=k;
            j--;
        }
        arr.add(sumL);

        return arr;
    }
}
