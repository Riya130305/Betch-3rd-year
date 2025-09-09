import java.util.*;
public class koko_banana_BS {
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
        int ans = minEatingSpeed(piles,h);
        System.out.println("Answer"+ " "+ans);
}
public static int minEatingSpeed(int[] piles, int h) {

        int j=Arrays.stream(piles).max().getAsInt();
        int start=1;
        int end =j;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ans(piles,h,mid)<=h)
            {
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
        }
        return start;
     }
    public static int ans(int[]piles,int h,int mid)
    {
        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            sum+=Math.ceil((double)piles[i]/mid);
        }
        return sum;
    }
}
