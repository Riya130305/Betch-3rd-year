//package Travesal(VT,DT,BT);
import java.util.*;
public class Boundary_Travesal {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        //1. Add root node data
        if(root==null)
        return arr;
        arr.add(root.data);
        // left side
        if(root.left!=null)
        boundaryleft(root.left,arr);
         //leaf node travesal
        boundaryLeaf(root.left,arr);
        boundaryLeaf(root.right,arr);
        //right node travesal
        if(root.right!=null)
        boundaryRight(root.right,arr);
        
        return arr;
        
    }
    public static void boundaryleft(Node root,ArrayList<Integer> arr)
    {
        // 
        if(root.left==null && root.right==null)
        {
            return;
        }
        //left travesal
        arr.add(root.data);
        if(root.left!=null)
        boundaryleft(root.left,arr);
        else if(root.right!=null)
        boundaryleft(root.right,arr);
       
        
    }
     public static void boundaryLeaf(Node root,ArrayList<Integer> arr)
    {
        // 
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        {
            arr.add(root.data);
            return;
        }
        
        boundaryLeaf(root.left,arr);
        boundaryLeaf(root.right,arr);
       
        
    }
    static ArrayList<Integer> res = new ArrayList<>();
    public static void  boundaryRight(Node root,ArrayList<Integer> arr)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(root.left==null && root.right==null)
        {
            return;
        }
        
       
        if(root.right!=null)
        boundaryRight(root.right,arr);
        
        else if(root.left!=null)
        boundaryRight(root.left,arr);
         // add after recursion to reverse automatically
        arr.add(root.data);
    }
    
}
