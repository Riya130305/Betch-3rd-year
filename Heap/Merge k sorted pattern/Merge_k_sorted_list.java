import java.util.*;

public class Merge_k_sorted_list {
    public static void main(String[] args) {
         // Create 3 sorted linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        // Create array of ListNode
        ListNode[] lists = new ListNode[]{list1, list2, list3};

        // Call mergeKLists method
        ListNode result = mergeKLists(lists);

        // Print the merged sorted list
        while(result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }

    
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)->(a.val-b.val));
        // Taking the 1st element of each nested list and add to minheap
        for(ListNode i:lists)
        {
            if(i!=null){
            pq.add(i);
            }
        }
        ListNode dummy= new ListNode(0);
        ListNode tail=dummy;

        while(!pq.isEmpty())
        {
            ListNode temp=pq.poll();
            tail.next=temp;
            tail=tail.next;

            if(temp.next!=null)
            {
                pq.add(temp.next);
            }

        }
        return dummy.next;

        // T.C=nk*log(k)

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}