import java.util.*;
public class DFSGraph {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
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
                dfs(adj,0,visited,ans);
            }
            
        }
        System.out.println(ans.toString()); //or sout(ans); ---> if it is the Arraylist  otherwise using if array use toString() function 
        // 1.Kyunki ArrayList class ne apna toString() override kiya hai.

            // a)Us method ke andar yeh logic hai:

                // Saare elements ko iterate karo,

                // Unko String me convert karo,

                // , se join karo,

                // Aur square brackets [ ] ke andar daalo.
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj ,int node,boolean[] visited,ArrayList<Integer> ans){
        visited[node]=true;
        ans.add(node);

        for(int nbr:adj.get(node))
        {
            if(!visited[nbr])
            {
                dfs(adj,nbr,visited,ans);
            }
        }
    }
}
