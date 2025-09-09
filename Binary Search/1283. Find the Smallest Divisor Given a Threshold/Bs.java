import java.util.*;
public class Bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
        int n=sc.nextInt();
        System.out.println("Enter the threshold value");
        int threshold =sc.nextInt();
        System.out.println("Input the array");
        int[] nums = new int[n]; 
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        } 
        int ans =smallestDivisor(nums,threshold);
        System.out.println(ans);
    }

    public static int fun(int[]nums,int threshold,int mid)
    {
        int sum =0;
        for(int j=0;j<nums.length;j++)
        {
            sum=sum+(int)Math.ceil((double)nums[j]/mid);
        }
        return sum;
    }

      public static int smallestDivisor(int[] nums, int threshold) {
       
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            max=Math.max(max,i);
        }
        int start=1;
        int end= max;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(fun(nums,threshold,mid)<=threshold)
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        } 
        return start;
    }
}
