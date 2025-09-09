import java.util.*;
public class subarrays {
    public static void main(String[] args) {
        // PRINTING THE SUBARRAYS
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Input the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
            int[] nums=new int[n];
            for(int j=0;j<=i;j++)
            {
                nums[i]=arr[j];
                System.out.print(nums[i]);
            }
            System.out.println();
        }

        // int[][] ans=fun(arr,n);
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.println(ans[i]);
        //     }
        // }
    }
    // public static int[][] fun(int[] arr,int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         int[] nums=new int[n];
    //         for(int j=0;j<=i;j++)
    //         {
    //             nums[i]=arr[j];
    //             System.out.print(nums[i]);
    //         }
    //         System.out.println();
    //         return nums;
    //     }
    // }
}
