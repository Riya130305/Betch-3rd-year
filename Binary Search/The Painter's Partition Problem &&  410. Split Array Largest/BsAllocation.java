import java.util.*;
class BsAllocation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int n = sc.nextInt();
        System.out.println("Enter k size");
        int k= sc.nextInt();
        System.out.println("Input the array");
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]= sc.nextInt();
        }
        int ans = splitArray(nums,k);
        System.out.println("ans"+" "+ans);
    }
    public static int fun(int[] nums,int i)
    {
        int count=1;
        int sum=0;

        for(int j=0;j<nums.length;j++)
        {
            sum+=nums[j];
            if(sum<=i)
            {
                continue;
            }
            else
            {
                count++;
                sum=0;
                sum+=nums[j];
            } 
        }
        return count;
    }

    public static int splitArray(int[] nums, int k) {
        int max = 0;
        int sum =0;
        for(int i:nums)
        {
            max = Math.max(max,i);
            sum += i;
        }
        // BINARY CODE
        int start =max;
        int end = sum;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(fun(nums,mid)<=k)
            {
                end= mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
