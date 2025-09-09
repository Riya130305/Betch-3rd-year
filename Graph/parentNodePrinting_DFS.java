import java.util.ArrayList;
import java.util.Arrays;

public class parentNodePrinting_DFS {
    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
            adj.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
            adj.add(new ArrayList<>(Arrays.asList(0)));
            adj.add(new ArrayList<>(Arrays.asList(0,5)));
            adj.add(new ArrayList<>(Arrays.asList(0,4)));
            adj.add(new ArrayList<>(Arrays.asList(3,5)));
            adj.add(new ArrayList<>(Arrays.asList(2,4)));
            boolean visited[]= new boolean[adj.size()];
            
            ArrayList<Integer> ans= new  ArrayList<Integer>(adj.size());
            for(int i=0;i<adj.size();i++)
            {
                dfs(adj,i,visited,ans);
            }
            System.out.println(ans);
    }    
    public static void dfs(ArrayList<ArrayList<Integer>> adj , int node, boolean[] visited,ArrayList<Integer> ans){
        visited[node]=true;
        ans.add(node);
        
    }

}
