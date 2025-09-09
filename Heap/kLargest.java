import java.util.PriorityQueue;
import java.util.Scanner;

public class kLargest {
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter k value");
        int k=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array of size n "+n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int[] ans = minHeap(arr,k);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println("ans-->"+ans[i]);
        }

    }

    public static int[] minHeap(int[] arr, int k)
    {
        int[] ans = new int[k];
        // Taking min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0]);

        for(int i=1;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int i=0;
        // for(int i=0;i<pq.size();i++)
        while (pq.size()>0) 
        {
            ans[i++]=pq.poll();
        }
        // Give answer in decending order, so reverse the order 
        return ans;
    }
}
