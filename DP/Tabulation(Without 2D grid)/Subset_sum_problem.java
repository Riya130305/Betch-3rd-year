import java.util.Scanner;

public class Subset_sum_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        boolean ans = isSubsetSum(arr,sum);
        System.out.println("ans-->"+ans);
    }
  public static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        boolean[][] dp=new boolean[n][sum+1];
        // Setting true to the first coloum
        for(int i=0;i<n;i++)
        {
            dp[i][0]=true;
        }
        // mark true to the first element of the array
        if(arr[0]<=sum)//to avoid the array bound limit
        {
            dp[0][arr[0]]=true;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                boolean not_pick=false;
                not_pick=dp[i-1][j];
                boolean pick=false;
                if(j-arr[i]>=0)
                {
                    pick=dp[i-1][j-arr[i]];
                }
                dp[i][j]=pick || not_pick;
            }
        }
        return dp[arr.length-1][sum];
    }}

