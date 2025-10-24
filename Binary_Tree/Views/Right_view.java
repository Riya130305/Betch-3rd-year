package Views;

import java.util.ArrayList;

public class Right_view {
    /*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    static int level=0;
    public ArrayList<Integer> rightView(Node root) {
        // code here
        // ArrayList<Integer> arr = new ArrayList<>();
        // Queue<Node> q= new LinkedList<>();
        // if(root==null)
        // return arr;
        // q.add(root);
        // while(!q.isEmpty())
        // {
        //     int size=q.size();
        //     arr.add(q.peek().data);
        //     while(size-->0)
        //     {
        //         Node temp = q.poll();
        //         if(temp.right!=null)
        //         q.add(temp.right);
        //          if(temp.left!=null)
        //         q.add(temp.left);
        //     }
            
        // }
        // return arr;
        
       // -------------third way to solve this problem-----
        ArrayList<Integer> arr = new ArrayList<>();
        level=0;
        rview(root,level,arr);
        return arr;
    }
    public static void rview(Node root, int level,ArrayList<Integer>arr){
        if(root==null)
        return;
        if(level==arr.size())
        arr.add(root.data);
        
        rview(root.right,level+1,arr);
        rview(root.left,level+1,arr);
    }
}
}
