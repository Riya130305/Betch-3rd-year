import java.util.*;
public class BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int n = sc.nextInt();
        System.out.println("Enter Numbers of days");
        int days=sc.nextInt();
        System.out.println("Input the weight");
        int[] weights= new int[n];
        for(int i=0;i<n;i++)
        {
            weights[i]=sc.nextInt();
        }
        int ans = shipWithinDays(weights,days);
        System.out.println(ans);
    }


    public static int fun(int[] weights,int i)
    {
        int count=1;
        int sum=0;
        for(int j=0;j<weights.length;j++)
        {
            sum+=weights[j];
            if(sum>i)
            {
                count+=1;
                sum=0;
                sum+=weights[j];
            }
        }
        return count;
    }

     public static int shipWithinDays(int[] weights, int days) {
        int sum =0;
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }

       int start =max;
       int end = sum;
       
       while(start<=end)
       {
            int mid = start+(end-start)/2;
            if(fun(weights,mid)<=days)
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