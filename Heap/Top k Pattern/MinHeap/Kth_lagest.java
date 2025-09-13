import java.util.*;
public class Kth_lagest {
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
        
        int ans = minHeap(arr,k);
        System.out.println("ans "+ans);

    }
    public static int minHeap(int[] arr , int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            pq.add(arr[i]);
            while(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.poll();
            
        
    }
}
