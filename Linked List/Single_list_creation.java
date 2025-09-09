import java.util.*;
public class Single_list_creation {

    
    static class Node{
        int data;
        Node next;

  //to take the manually if constructor is not made... 

        // Node n1= new Node();   constructor make by default 
        // Node n2 = new Node();
        // Node n3= new Node();

        // n1.data=10;
        // n2.data=20;
        // n2.data=30;
        Node(int data) //Constructor
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head =null;

    public void creation()
    {
        int data;
        
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-->0)
        {
            System.out.println("Enter a data");
            data=sc.nextInt();
            Node new_node=new Node(data);//Object (or way to create the new linked list)

            if(head==null)
            {
                head=new_node;
            }
            else
            {
                new_node.next=head;  //new_node.next is showing the address(or link)
                head=new_node;
            }
            
        }
    }

    public void travesal()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("No Linked list is exist");

        }
        else{
            while(temp!=null)
            {
                
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        //Creating obbject of the single list creation class
        Single_list_creation obj=new Single_list_creation();
        obj.creation();
        obj.travesal();

    }

}
