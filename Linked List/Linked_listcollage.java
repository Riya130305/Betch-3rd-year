// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int data) // data and d are same
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head;
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
    
    void first(int data)
    {
        if(head==null)
        {
            Node n =new Node(data);
            head=n;
        }
        else
        {
                Node n= new Node(data);
                n.next=head;
                head=n;
        }
    }

    void delete(int data)
    {
        if(head==null)
        {
            System.out.println("Empty LinkedList");
        }
        if(data==head.data)
        {
            head=head.next;
            return ;
        }
        Node current=head;
        while(current.next!=null && current.next.data!=data)
        {
            current=current.next;
        }
        if(current.next==null)
        {
            System.out.println("Not found");
            return;
        }
        else
        {
            current.next=current.next.next;
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
}
class Linked_listcollage {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        LinkedList ll= new LinkedList();
        ll.addlast(2);
        ll.addlast(13);
        ll.addlast(26);
        ll.addlast(10);
        ll.addlast(23);
        ll.first(0);
        ll.delete(26);
        ll.print();
    }
}