package Practice;
import java.util.*;
class Creation
{
    // intilize the array
    int[] arr;
    int top;
    // constructor
    public Creation (int size)
    {
        this.arr=new int[size];
        this.top=-1;
    }

    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if(arr.length-1==top)
        {
            return true;
        }
        return false;
    }
    public void push(int data)
    {
        if(isEmpty())
        {
            top++;
            arr[top]=data;
        }
        else
        {
            // Stack overflow condition
            if(isFull())
            {
                System.out.println("Overflow condition");
                return;
            }
            else
            {
                top++;
                arr[top]=data;
            }
        }
    }
    public int pop()
    {
        int p=0;
        if(isEmpty())
        {
            System.out.println("Underflow");
            return -1;
        }
        else
        {
            p=arr[top];
            top--;
        }
        return p;
    }
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return arr[top];
        }
    }
}
public class stack {
    // Stack using the array
    public static void main(String[] args) {
        Creation sc= new Creation(4);
    sc.push(11);
    sc.push(12);
    sc.push(90);
    System.out.println("pop"+sc.pop());
    System.out.println("Top"+sc.peek());

    }
    
}
