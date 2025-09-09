import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head;
    // Node tail;
    // ListNode(Listnode )

    // LinkedList(LinkedList head,int data)
    // {
    //     Node new_node = new Node(head.data);
    //     if(head==null)
    //     {
    //         head=null;
    //         tail=null;
    //         return;
    //     }
    //     else
    //     {
    //         tail.next=new_node;
    //         tail=new_node;
    //     }
    // }
    void addlast(int data)
    {
        if(head==null)
        {
            Node n = new Node(data);
            head = n;
        }
        
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            Node n =new Node(data);
            current.next=n;
        }
    }

    void print()
    {
        Node current = head;
        while(current.next!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    // Node current = head;
    // void rev(Node current)
    // {
    //     Node n = new Node(current.data);
    //     current
    // }
    LinkedList rev(LinkedList head)
    {
        Node current=head;

    }

}
class Pallindrome {
     
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        LinkedList ll= new LinkedList();
        ll.addlast(2);
        ll.addlast(13);
        ll.addlast(26);
        ll.addlast(10);
        ll.addlast(23);
        ll.addlast(0);
        ll.print();
    }
}