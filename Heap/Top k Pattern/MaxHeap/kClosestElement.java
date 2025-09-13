import java.util.*;
import java.util.ArrayList;
public class kClosestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k value");
        int k =sc.nextInt();
        System.out.println("enter x value");
        int x=sc.nextInt();
        System.out.println("enter array");
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans = maxHeap(arr,k,x);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println("ans-->"+ans.get(i));
        }
    }
    public static ArrayList<Integer> maxHeap(int[] arr,int k , int x)
    {
        //  int[] ans = new int[k];
        // Taking min heap
       PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] == b[1]) {
                    return b[0] - a[0]; 
                }
                return b[1] - a[1]; 
            }
        );

        for(int i=0;i<arr.length;i++)
        {
            int diff=Math.abs(arr[i]-x);
            pq.offer(new int[]{arr[i],diff});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        // int i=0;
       
        ArrayList<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll()[0]);
        }

        Collections.sort(result); 
        return result;
    }
}
