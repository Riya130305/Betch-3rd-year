import java.util.*;

import javax.swing.tree.TreeNode;

public class Miminum_leaf_node {
    public static void main(String[] args) {
        
    }
    class Solution {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        return fun(root);
    }

    public int fun(TreeNode root) {

        if (root == null) 
            return Integer.MAX_VALUE;

        if (root.left == null && root.right == null)
            return 1;

        int leftDepth = fun(root.left);
        int rightDepth = fun(root.right);

        return 1 + Math.min(leftDepth, rightDepth);
    }
}

}

public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }