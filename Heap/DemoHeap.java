import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoHeap {
    public static void main(String[] args) {
          List<Integer> heap = new ArrayList<>(Arrays.asList(2, 12, 5, 13, 14));
        int insert=3;
        List<Integer> ans= minHeap(heap,insert);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }

    }
    // public static int left_child(int x){
    //     return (2*x+1);
    // }
    // public static int right_child(int x){
    //     return (2*x+2);
    // }
    // public static int parent(int x){
    //     return (int)((x-1)/2);
    // }
    // int[] arr={2,12,5,13,14};
    // int insert=3;
    public static List<Integer> minHeap(List<Integer>heap,int insert){
        heap.add(insert);
        int index=heap.size()-1;

        while(index>0)
        {
            int p=(int)(index-1)/2;

            if(heap.get(p)>heap.get(index))
            {
                // Swap
                int temp=heap.get(p);
                heap.set(p,heap.get(index));
                heap.set(index,temp);

                index=p;
                p=(int)(index-1)/2;
            }

        }
        return heap;
        
    }


}
