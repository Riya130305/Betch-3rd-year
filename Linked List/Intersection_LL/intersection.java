import java.util.*;
class ListNode{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val=val;
        this.next=null;
    }
}
public class intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[] = {4,1,8,4,5};
        int arr2[] = {5,6,1,8,4,5};
        ListNode l1=createLinkedList(arr1);
        System.out.println("first LL");
        ListNode l2=createLinkedList(arr2);
        print(l1);
         System.out.println("second LL");
        print(l2);
        // Creating the shared tail of both lists
        ListNode common = createLinkedList(new int[]{8, 4, 5});

        // Creating first linked list: 4 -> 1 -> [8 -> 4 -> 5]
        l1 = new ListNode(4);
        l1.next = new ListNode(1);
        l1.next.next = common;

        // Creating second linked list: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(1);
        l2.next.next.next = common;
        System.out.println("Final Linked list");
        ListNode ans=interLL(l1,l2);
        print(ans);

    }

    public static ListNode createLinkedList(int[] arr)
    {
        if(arr.length==0)
            return null;
        ListNode head=new ListNode(arr[0]);
        ListNode curr=head;
        for(int i=1;i<arr.length;i++)
        {
            curr.next=new ListNode(arr[i]);
            curr=curr.next;
            // System.out.println("l1.val "+l1.val);
        }
        return head;
    }
    public static void print(ListNode head)
    {
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static ListNode interLL(ListNode head1,ListNode head2)
    {
       
        ListNode curr1=head1;
        ListNode curr2=head2;

        
        while(curr1!=curr2)
        {
             curr1=curr1.next;
            curr2=curr2.next;   
            if(curr1==curr2)
                return curr1;   
            if(curr1==null)
                curr1=head2;
            if(curr2==null)
                curr2=head1;
               
           
        }
        return null;
    }

}
