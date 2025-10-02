import java.util.*;
public class Coin_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        } 
        int amount=sc.nextInt();
        int ans = coinChange(coins,amount);
        System.out.println("ans->"+ans);
    }
    
}
