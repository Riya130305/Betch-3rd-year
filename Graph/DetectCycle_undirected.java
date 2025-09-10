import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycle_undirected {
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
                if(!visited[i])
                {
                    dfs(adj,i,visited,ans,-1);
                }
            }
    }
        public static boolean dfs(ArrayList<ArrayList<Integer>> adj , int node, boolean[] visited,ArrayList<Integer> ans,int parent){
            visited[node]=true;
            ans.add(node);
            System.out.println("parent "+parent+" node"+node);

            for(int nbr:adj.get(node))
            {
                if (!visited[nbr]) 
                {
                    if (dfs(adj, nbr, visited, ans, node)) {
                        return true;   // agar kahin cycle mili to propagate karo
                    }
                } else if (nbr != parent) {
                // visited hai aur parent nahi hai → cycle detected
                return true;
                }
            }
            return false;

        }
}
