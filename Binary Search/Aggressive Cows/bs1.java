import java.util.*;
public class bs1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a size");
        int n= sc.nextInt();
        System.out.println("Enter k cows");
        int k = sc.nextInt();
        System.out.println("Input the array");
        int stalls[] =new int[n];
        for(int i=0;i<n;i++)
        {
            stalls[i]=sc.nextInt();
        }
        int ans = aggressiveCows(stalls,k);
        System.out.println("ans"+" "+ans);
    }

    public static int fun(int[] stalls,int i)
    {
        int count=1;
        int last_cow=stalls[0];
        for(int j=0;j<stalls.length;j++)
        {
            if(stalls[j]-last_cow>=i)
            {
                count++;
                last_cow=stalls[j];
            }
        }
        return count;
    }    
public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
        int start =0;
        int end =stalls[n-1] - stalls[0];
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(fun(stalls,mid)>=k)
            {
                start=mid+1;
            }
            else
            {
                end =mid-1;
            }
        }
        return end;
    }
}