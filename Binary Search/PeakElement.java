import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        int[] nums={0,0,0};
        int ans = findPeakElement(nums);
       System.out.println("ans-->"+ans);
    }
    public static int findPeakElement(int[] nums)
    {
         int n=nums.length;
        int s=0;
        int e=n-1;

        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1])
            {
                e=mid;
            }
            if(nums[mid]<nums[mid+1])
            {
                s=mid+1;
            }
        }
        return  e;
        // int n=nums.length;
        // if(n==1)
        // {
        //     return nums[0];
        // }
        // int s=0;
        // int e=n;

        // while(s<=e)
        // {
        //     int mid=s+(e-s)/2;
        //     if(mid<n && nums[mid]>=nums[mid+1])
        //     {
        //         return mid;
        //     }
        //     else
        //     {
        //         s=mid+1;

        //     }
        // }

        //  while(s<=e)
        // {
        //     int mid=s+(e-s)/2;
        //     if(mid>=0 && nums[mid]>=nums[mid-1])
        //     {
        //         return mid;
        //     }
        //     else
        //     {
        //         e=mid-1;
                
        //     }
        // }
        // return -1;
    }
}
