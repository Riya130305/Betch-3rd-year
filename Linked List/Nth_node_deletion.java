import java.util.*;

public class Nth_node_deletion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head=null;
        ListNode tail=null;
        for(int i=0;i<n;i++)
        {
            int a= sc.nextInt();
            ListNode newNode = new ListNode(a);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
        }
        int k=sc.nextInt();
        head=removeNthFromEnd(head,k);
        ListNode curr= head;
        while(curr!=null)
        {
            System.out.println(curr.val);
            // if(curr.next!=null)
            // System.out.println("");
            curr=curr.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp =head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        int c=0;
        arr.remove(arr.size()-n);
        ListNode ans=new ListNode(0);
        ListNode dummy=ans ;
        for(int i=0;i<arr.size();i++)
        {
            dummy.next=new ListNode(arr.get(i));
            dummy=dummy.next;
        }
        return ans.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    public ListNode(int val,ListNode next)
    {
        this.val=val;
        this.next=next;
    }
}