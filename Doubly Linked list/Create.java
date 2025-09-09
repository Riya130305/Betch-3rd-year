import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
} 
class Doublell{//connection established here
    Node head=null;
    Node tail=null;
    //Insertion at beginning 
     void add(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else
        {
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
        }
    }

    void print()
    {
        if(head==null)
        {
            System.out.println("empty");
        }
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    
}

public class Create{
    public static void main(String[] args)
    {
        Doublell c = new Doublell();
        c.add(23);
        c.add(39);
        c.add(21);
        c.print();

    }
}
