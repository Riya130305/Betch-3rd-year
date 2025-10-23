import java.util.*;

public class LevelOrderinspiralform {

    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to build a binary tree from level order input
    public static Node buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equals("N"))
            return null;

        Node root = new Node(Integer.parseInt(nodes[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < nodes.length) {
            Node curr = q.poll();

            // Left child
            if (!nodes[i].equals("N")) {
                curr.left = new Node(Integer.parseInt(nodes[i]));
                q.add(curr.left);
            }
            i++;
            if (i >= nodes.length) break;

            // Right child
            if (!nodes[i].equals("N")) {
                curr.right = new Node(Integer.parseInt(nodes[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    // Function to print spiral order traversal
    public static ArrayList<Integer> findSpiral(Node root) {
        Stack<Node> s1 = new Stack<>(); // Right to Left
        Stack<Node> s2 = new Stack<>(); // Left to Right
        ArrayList<Integer> arr = new ArrayList<>();

        if (root == null)
            return arr;

        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                arr.add(temp.data);
                if (temp.right != null)
                    s2.push(temp.right);
                if (temp.left != null)
                    s2.push(temp.left);
            }
            while (!s2.isEmpty()) {
                Node temp = s2.pop();
                arr.add(temp.data);
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format (level order, use N for null)
        // Example: 1 3 2 7 6 N 9 N N 8 N N N
        System.out.println("Enter tree nodes in level order (use N for null):");
        String input = sc.nextLine();
        String[] nodes = input.split(" ");

        Node root = buildTree(nodes);
        ArrayList<Integer> result = findSpiral(root);

        System.out.println("Spiral Level Order Traversal:");
        for (int val : result)
            System.out.print(val + " ");
    }
}
