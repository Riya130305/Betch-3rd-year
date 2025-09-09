import java.util.*;
public class optimze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Input the array");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]= sc.nextInt();
        } 
        int answer=numberOfSubarrays(nums,k);
        System.out.println("answer"+" "+answer);
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int ans = fun(nums,k)-fun(nums,k-1);
        return ans;
    }
    public static int fun(int[] nums,int k){
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        // if(k<0)return 0;
        while(r<nums.length)
        {
            sum+=nums[r]%2;
            while(sum>k)
            {
                sum=sum-nums[l]%2;
                l++;
            }
            count=count+(r-l+1);
        r++;
        }
        return count;
    }
}
