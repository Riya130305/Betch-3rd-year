import java.util.*;

public class topKFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k");
        int k = sc.nextInt();
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("Enter a array");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] res = minHeap(arr,k);
        System.out.println("ans start");
        for(int i=0;i<res.length;i++){
            System.out.println("ans-->"+res[i]);
        }
        System.out.println("ans end");
    }
    public static int[] minHeap(int[] arr, int k){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // for(int key:map.keySet())
        // {
        //     System.out.println("key-->"+key);
        // }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int key:map.keySet())
        {
            pq.add(key);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i=0;
        while(pq.size()>0)
        {
            ans[i]=pq.poll();
            i++;
            
        }
       
        return ans;
    }
}
