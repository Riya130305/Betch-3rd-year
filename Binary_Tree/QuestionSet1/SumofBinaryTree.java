import java.util.*;
public class SumofBinaryTree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a root node");
        int rootVal=sc.nextInt();
        Node root= new Node(rootVal);
        buildTree(root,sc);
        int ans = sumBT(root);
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
    static int sum=0;
     static int sumBT(Node root) {
        // Your code here
        sum=0;
        fun(root);
        return sum;
    }
    public static void fun(Node root)
    {
        if(root==null)
        {
            return;
        }
        //System.out.println("data"+root.data);
        sum=sum+root.data;
        //System.out.println("sum"+sum);
        fun(root.left);
        fun(root.right);
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