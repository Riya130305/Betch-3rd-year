import java.util.*;
public class Course_sechdule2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] array= new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;i++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        int[] ans =findOrder(n,array);
        System.out.println(ans);
    }
    public static int[] findOrder(int n, int[][] array)
    {
        int[] ans = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        int[] inDegree= new int[n];
        Queue<Integer> q= new LinkedList<>();

        for(int edg[]:array)
        {
            int u=edg[0];
            int v=edg[1];
            adj.get(u).add(v);
            inDegree[v]++;
        }

        for(int i=0;i<n;i++)
        {
            if(inDegree[i]==0)
            {
                q.add(i);
            }
        }
        int i=0;
        while(!q.isEmpty())
        {
            int val=q.poll();
            ans[i]=val;
            if(inDegree[val]!=0)
            {
                inDegree[val]--;
            }
            if(inDegree[val]==0)
            {
                q.add(val);
            }
        }
        return ans;
    }
}