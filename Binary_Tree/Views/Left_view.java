package Views;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Left_view {
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root== null)
        return arr;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            arr.add(q.peek().data);
            while(size-->0)
            {
                Node temp = q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                q.add(temp.right);
            }
            
        }
        return arr;
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
}