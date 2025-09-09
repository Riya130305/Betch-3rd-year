import java.util.*;
public class brute_fr {
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
    public static int numberOfSubarrays(int[] nums, int k) 
    {
        int ans =0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i,c=i;j<nums.length && c<=j;j++,c++)
            {
                
                    if(nums[c]%2==1)
                    count++;
                    if(count>k)
                    break;
                
                if(count==k)
                ans+=1;
            }
        }
        return ans;
    }
}
