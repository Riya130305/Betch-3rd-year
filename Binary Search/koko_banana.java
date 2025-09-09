import java.util.*;
public class koko_banana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size");
        int n=sc.nextInt();
        System.out.println("Enter a number of hours");
        int h=sc.nextInt();
        int[] piles=new int[n];
        for(int i=0;i<n;i++)
        {
            piles[i]=sc.nextInt();
        }
        int ans = min(piles,h);
        System.out.println("Answer"+ " "+ans);
    }
    public static int min(int[]piles,int h)
    {
        int maxSpeed = Arrays.stream(piles).max().getAsInt();
        
        for (int a = 1; a <= maxSpeed; a++) {
            int sum = 0;
            for (int i = 0; i < piles.length; i++) {
                sum += (int) Math.ceil((double) piles[i] / a);
            }
            if (sum <= h) {
                return a; 
            }
        }
        return 0; 
    }
}
