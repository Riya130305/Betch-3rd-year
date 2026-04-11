package QuestionSet1;

import java.util.*;

// 1. Definition for a binary tree node.
class TreeNode {
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

public class BinaryTreePaths {
    
    // 2. The logic you will submit to LeetCode
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> arr= new ArrayList<>();
       if(root==null) return arr;
       String st = String.valueOf(root.val);
       path(root,st,arr);
       return arr;
    }
    public static void path(TreeNode root, String st, List<String> arr){
        if(root.left==null && root.right==null){
            arr.add(st);
            return;
        }
        //st+=String.valueOf(root.val);
        if(root.left!=null){
            path(root.left,st+"->"+String.valueOf(root.left.val),arr);
        }
        if(root.right!=null){
            path(root.right,st+"->"+String.valueOf(root.right.val),arr);
        }
    }

    // 3. Main method to test the input locally
    public static void main(String[] args) {
        BinaryTreePaths solution = new BinaryTreePaths();

        // Constructing Example 1: [1,2,3,null,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> result = solution.binaryTreePaths(root);

        // Printing results
        System.out.println("Root-to-Leaf Paths:");
        System.out.println(result);
    }
}