import java.util.*;
class ListNode{
    int val;
    ListNode next;
     ListNode(int val){
        this.val=val;
        this.next=null;
     }
}
public class eo{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Size of aray");
      int n=sc.nextInt();
      int[] arr= new int[n];
      System.out.println("enter a array");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }

      ListNode head=createLinkedList(arr);
      System.out.println("Original List");
      printList(head);
      ListNode head1=evenOdd(head);
      System.out.println("Even");
      printList(head1);
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
      }
      return head;
   }

   public static ListNode printList(ListNode head)
   {
      ListNode curr=head;
      while(curr!=null){
         System.out.print(curr.val+"->");
         curr=curr.next;
      }
      System.out.println("null");
      return head;
   }

   public static ListNode evenOdd(ListNode head){

      
      ListNode odd=head;
      ListNode even=head.next;
      ListNode evenHead=even;

      
      while(even != null && even.next != null)
      {
        odd.next=even.next;
        odd=odd.next;

        even.next=odd.next;
        even=even.next;
      }
      odd.next=evenHead;
      return head;
   }
}