import java.util.*;

public class Insertion_Heapify {
    // public static void insertH(ArrayList<Integer> heap,int val)
    // {
    //     heap.add(val);
    //     int size=heap.size();
    //     Heapify(heap,size,0);
    // }
    public static void Heapify(ArrayList<Integer> heap,int size,int i)
    {
        int smallest =i;
        int left_child=(2*i)+1;
        int right_child=(2*i)+2;

        if(left_child<size && heap.get(smallest)>heap.get(left_child))
        {
            smallest=left_child;
        }

        if(right_child<size && heap.get(right_child)<heap.get(smallest))
        {
            smallest=right_child;
        }

        if(smallest!=i)
        {
            int temp=heap.get(i);
            heap.set(i,heap.get(smallest));
            heap.set(smallest,temp);
            Heapify(heap,size,smallest);
        }
    }

    public static void print(ArrayList<Integer> heap)
    {
        for(int i=0;i<heap.size();i++)
        {
            System.out.println("ans "+heap.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 7, 3, 8, 11, 13, 1));
        int size = arr.size(); 
         for (int i =size/2-1; i >= 0; i--) {
            Heapify(arr, size, i);
        }

        print(arr);
    }
}
