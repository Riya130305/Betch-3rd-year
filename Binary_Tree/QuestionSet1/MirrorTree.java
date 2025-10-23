package QuestionSet1;

public class MirrorTree {
   
    void mirror(Node root) {
        // code here
        if(root==null)
        return ;
        // swapping
        Node temp = root.left;
        root.left=root.right;
        root.right=temp;
        
        mirror(root.left);
        mirror(root.right);
    }
}
