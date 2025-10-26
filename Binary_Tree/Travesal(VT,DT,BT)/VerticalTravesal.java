// package Travesal(VT,DT,BT);
import java.util.*;
public class VerticalTravesal {
    static int l=0;
    static int r=0;

    public static void main(String[] args) {
        
    }
    public static ArrayList<ArrayList<Integer>> verticalOrder(Node root)
    {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        l=0;
        r=0;
        if(root==null)
        return arr;

        ArrayList<ArrayList<Integer>> negative = new ArrayList<>();
        int negativeSize=Math.abs(l)+1;
        for(int i=0;i<negativeSize;i++)
        {
            negative.add(new ArrayList<>());
        }
        ArrayList<ArrayList<Integer>> positive = new ArrayList<>();
         for(int i=0;i<=r;i++)
        {
            positive.add(new ArrayList<>());
        }

        Queue<Node> q = new LinkedList<>();
        Queue<Integer> idx= new LinkedList<>();

        q.add(root);
        idx.add(0);

        
        while (!q.isEmpty()) {
            Node temp = q.poll();
            int pos = idx.poll();

            if (pos< 0) {
                // positive.get(pos).add(temp.data);
                negative.get(Math.abs(pos)).add(temp.data);
            } else {
                 positive.get(pos).add(temp.data);
                //negative.get(Math.abs(pos)).add(temp.data);
            }

            if (temp.left != null) {
                q.add(temp.left);
                idx.add(pos - 1);
            }
            if (temp.right != null) {
                q.add(temp.right);
                idx.add(pos + 1);
            }
        }

        // Merge negative (reverse order) and positive lists
        for (int i = negative.size() - 1; i > 0; i--) {
            arr.add(negative.get(i));
        }
        for (int i = 0; i < positive.size(); i++) { // skip positive[0] because it's already added in negative[0] if l<0
            arr.add(positive.get(i));
        }

        return arr;
    }
    
    // finding the leftmost and rightmost element
    public static void find(Node root,int pos)
    {
        if(root==null)
        return;

        l=Math.min(l,pos);
        r=Math.max(r,pos);

        find(root.left, pos-1);
        find(root.right, pos+1);
    }
}
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data)
    {
        this.data=data;
        this.right=null;
        this.left=null;

    }
}