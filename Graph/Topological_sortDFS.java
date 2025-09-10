import java.util.*;
import java.util.Stack;

public class Topological_sortDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();

        // build adjacency list
        adj.add(new ArrayList<>(Arrays.asList()));       // 0
        adj.add(new ArrayList<>(Arrays.asList()));       // 1
        adj.add(new ArrayList<>(Arrays.asList(3)));      // 2 → 3
        adj.add(new ArrayList<>(Arrays.asList(1)));      // 3 → 1
        adj.add(new ArrayList<>(Arrays.asList(0,1)));    // 4 → 0,1
        adj.add(new ArrayList<>(Arrays.asList(0,2)));    // 5 → 0,2

        boolean[] visited = new boolean[adj.size()];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<adj.size();i++) {
            if(!visited[i]) {
                dfs(adj,i,visited, st);
            }
        }

        System.out.println("Topological Order:");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj , int node, boolean[] visited, Stack<Integer> st){
        visited[node]=true; 
        for(int nbr:adj.get(node)) {
            if(!visited[nbr]) {
                dfs(adj,nbr,visited ,st);
            }
        }
        st.push(node);
    }
}
