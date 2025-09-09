import java.util.*;
public class minDaysBS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int n=sc.nextInt();
        System.out.println("Enter a number of bouquet");
        int m = sc.nextInt();
        System.out.println("Enter no. of consicutive flower should take");
        int k=sc.nextInt();
        int[] bloomDay=new int[n];
        System.out.println("Bloomdays array");
        for(int i=0;i<n;i++)
        {
            bloomDay[i]=sc.nextInt();
        }
        int ans = minDays(bloomDay,m,k);
        System.out.println("ans"+" "+ans);
    }


    public static int fun(int[] bloomDay,int m ,int k,int mid)
    {
        int ans =0;
        int count=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=mid)
            {
                count++;
            }
            else
            {
                ans=ans+(count/k);
                count=0;
            }
        }
        ans=ans+(count/k);
       return ans;

    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
       if(val>bloomDay.length)return -1;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        
        for (int day : bloomDay) {
            start = Math.min(start, day);
            end = Math.max(end, day);
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(fun(bloomDay,m,k,mid)>=m)
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
}