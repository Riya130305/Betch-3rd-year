import java.util.*;
public class LongestIncreasingSubsequence {
    public int LIS(int[] nums) {
       int n=nums.length;
       int[] dp=new int[n];
       int[] parent=new int[n];
       Arrays.fill(dp,1);
       for(int i=0;i<n;i++){
        parent[i]=i;
       }
       for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    parent[i]=j;
                }
            }
        } 
        int max=-1;
        int lastInd=-1;
        for (int i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
                lastInd=i;
            }
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(nums[lastInd]);
        while(lastInd!=parent[lastInd]){
            ans.add(nums[parent[lastInd]]);
            lastInd=parent[lastInd];
        }
        Collections.reverse(ans);
        System.out.print(ans);

        return max;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence sol = new LongestIncreasingSubsequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = sol.LIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}