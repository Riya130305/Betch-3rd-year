package QuestionSet1;

import java.util.Scanner;

public class Count_leave_node {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a root node");
        int rootVal=sc.nextInt();
        Node root= new Node(rootVal);
        buildTree(root,sc);
        int ans = countLeaves(root);
        System.out.println("ans-->"+ans);
    }
    public static void buildTree(Node root, Scanner  sc)
    {
        // left child
        System.out.println("want to enter left child");
        boolean hasLeft=sc.nextBoolean();
        if(hasLeft)
        {
            System.out.println("left");
            int left =sc.nextInt();
            root.left=new Node(left);
            buildTree(root, sc);
        }
          // left child
        System.out.println("want to enter right child");
        boolean hasRight=sc.nextBoolean();
        if(hasRight)
        {
            System.out.println("right");
            int right =sc.nextInt();
            root.right=new Node(right);
            buildTree(root, sc);
        }
    }
    static int count=0;
    public static int countLeaves(Node node) {
        // Your code
        count=0;
        fun(node);
        return count;
    }
    public static void fun(Node node)
    {
        if(node==null)
        return ;
        if(node.left==null && node.right==null)
        {
            count++;
            return;
        }
        fun(node.left);
        fun(node.right);
        
    }

}
class Node {
    int data;
    Node right;
    Node left;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
