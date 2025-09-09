
import java.util.*; 
public class LevelOrderTravesal {
    public static List<Integer> Logic(Node root)
    {
        List<Integer> list = new ArrayList<>();
        if(root==null)
        return list;
        Queue<Node> q= new LinkedList<>();
        
        q.add(root);
        //  list.add(root.data);
        while(!q.isEmpty()){
            Node n= q.poll();
            list.add(n.data);
            if(n.left!=null)
            {
                q.add(n.left);
            }

            if(n.right!=null)
            {
                q.add(n.right);
            }
        }
    return list;

    }
    public static void main(String[] args) {
         Node root = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n2.right=n6;

        List<Integer> ans =Logic(root);
        
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data    ){
        this.data=data;
        this.left=null;
        this.right=null;

    }
    public Node(int data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;

    }
}
