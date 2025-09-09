import java.util.*;

public class Balanced_tree {

    // Node class (like TreeNode but renamed to Node for your program)
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   
    public static boolean isBalanced(Node root) {
         if(root==null)
        {
            return true;
        }
        // int abs=count(root);
        // if(abs!=0 || abs!=1)
        // {
        //     return false;
        // }
        // return true;
         int left= height(root.left);
        int right= height(root.right);

        if(Math.abs(left-right)>1)
        return false;

        return isBalanced(root.left) && isBalanced(root.right);
       
    }

    
    private static int height(Node root) {
        if(root==null)
            return 0;
            
        // if(root.left==null && root.right==null)
            // return 1;

        // int left= count(root.left);
        // int right= count(root.right);
        // int dif = right-left;
        // int abs=Math.abs(dif);
        // return abs; 
        return Math.max(height(root.left),height(root.right))+1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;

        boolean ans = isBalanced(root);
        System.out.println("Is tree balanced? " + ans);
    }
}
