// package Top k Pattern.MinHeap;
import java.util.*;

    public class a{
        public static void main(String[] args) {
            int[] nums={100,98,93,34,100};
            int k=3;
            int[] arr = maxKDistinct(nums,k);
            for(int i:arr)
            {
                System.out.println("ans-->"+i);
            }
        }
    public static int[] maxKDistinct(int[] nums, int k) {
        // minHeap
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums)
            {
                System.out.println("set-->"+set);
                set.add(i);
            }
        //     int j=0;
        //     int[] res= new int[set.size()];
        //     for(int i:set)
        //     {
        //         res[j++]=i;
        //     }
        // pq.add(res[0]);

        // for(int i=1;i<res.length;i++)
        //     {
        //         pq.add(res[i]);
        //         if(pq.size()>k)
        //         {
        //             pq.poll();
        //         }
            
        for(int i:set)
            {
                pq.add(i);
                if(pq.size()>k)
                {
                    pq.poll();
                }
            }
        int[] ans = new int[pq.size()];
        int i=pq.size()-1;
            
        while(pq.size()>0)
            {
                ans[i--]=pq.poll();
            }

   
        // int left = 0, right = k-1;
        // while(left < right) {
        //     int temp = ans[left];
        //     ans[left] = ans[right];
        //     ans[right] = temp;
        //     left++;
        //     right--;
        // }
        return ans;


        
        
    }
}
