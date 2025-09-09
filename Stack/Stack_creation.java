package Stack;

import java.util.ArrayList;

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

class stackLL{
    Node head;
    // constructor
    public stackLL()
    {
        head=null;
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    } 
    public void push(int data)
    {
        Node temp = new Node(data);
        if(isEmpty())
        {
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("underflow");
            return -1;
        }
        Node temp=head;
        head=head.next;
        return temp.data;
    }
}

class StackArray{
    int[]arr;
    int top;

    // constructor
    public StackArray(int size)
    {
        arr = new int[size];
        top=-1; 
    }

    public boolean isFull()
    {
        if(arr.length-1==top)
        {
            return true;
        }
        return false;
    }
    public void push(int data) //top or data are same
    {
        // overflow condition 
        if(isFull())
        {
            System.out.println("Stack overflow ");
            return;
        }
        top++;
        arr[top]=data;
    }

    // Pop out the element
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underFlow");
            return -1;
        }
        int p = arr[top];
        top--;
        return p;
    }
    // to get the top value
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}
public class Stack_creation {
    public static void main(String[] args) {
        StackArray s_array = new StackArray(22);
        s_array.push(23);
        s_array.push(45);
        s_array.push(78);
        System.out.println(s_array.pop());

    }
}
