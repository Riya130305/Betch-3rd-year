import java.util.*;

public class Digonal {
     static int l=0; 
    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        l=0;
       // int pos=0;
        find(root,0);
        
        int leftSize=l+1;
        ArrayList<ArrayList<Integer>> left = new ArrayList<>();
        for(int i=0;i<leftSize;i++)
        {
            left.add(new ArrayList<>());
        }
        // Recursively NLR(Preorder) chna hai 2d martix mai index ke according
         
        findDiagonal(root,left,0);
        
        for(ArrayList<Integer> list:left)
        {
            ans.addAll(list);
        }
         return ans;
        
    }
    public static void findDiagonal(Node root,ArrayList<ArrayList<Integer>> left ,int pos )
    {
        
        //NLR
        if(root==null)
        return ;
        
        left.get(pos).add(root.data);
        findDiagonal(root.left,left,pos+1);
        findDiagonal(root.right,left,pos);
        
    }
    public static void find(Node root,int pos)
    {
        if(root==null)
        return;
        
        l=Math.max(l,pos);
        
        find(root.left,pos+1);
        find(root.right,pos);
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