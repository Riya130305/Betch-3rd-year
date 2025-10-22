import java.util.*;
public class Size_of_BT {
    static int count=1;
    public static int getSize(Node node) {
        // code here
        if(node==null)
        return 0;
        count=1;
        getSize(node);
        //return count;
        // oR
        int a=getSize(node.left);
        int b=getSize(node.right); 
        return 1+a+b; 
    }

    // public static void fun(Node node)
    // {
    //     if(node==null)
    //     return;
        
    //     count++;
    //     fun(node.left);
    //     fun(node.right);
        
        
    // }
}
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}
