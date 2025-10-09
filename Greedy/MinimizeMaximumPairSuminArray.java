import java.util.*;
public class MinimizeMaximumPairSuminArray {
    public static void main(String[] args) {
        int[]nums={1,31,25,6};
    
        int ans = minPairSum(nums);
        System.out.println("ans->"+ans);
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);//O(nlogn)
        int max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length/2;i++)
        {
            int sum=nums[i]+nums[nums.length-i-1];
            max=Math.max(sum,max);
        }//O(n)
        return max;
        //T.C->O(n)+O(nlogn)
        //S.C->O(1)
    }
}
