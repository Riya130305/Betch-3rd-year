import java.util.*;
    class Stack{
        int arr[];
        int top;

       public Stack(int size)
        {
            arr=new int[5];
            top=-1;
        }
        public  boolean isEmpty(){
            if(top==-1)
            {
                return true;
            }
            return false;
        }
    
        public  boolean isFull(){
            if(arr.length-1<=top)
            {
                return true;
            }
            return false;
        }
    
    
        public void push(int val)
        {
            if(isFull())
            {
                System.out.println("Overflow");
            }
            top++;
            arr[top]=val;
            System.out.println("val "+val+" push"); 
        }
    
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Underflow");
               return top;
            }
            int p=arr[top];
                top--;
            return p;
        }
    }
public class stack_implementation {
    
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(2);
        st.push(25);   
        st.push(20); 
        st.push(100);
        st.push(230);
        st.push(45);  
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
