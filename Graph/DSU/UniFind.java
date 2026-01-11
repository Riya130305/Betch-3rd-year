package DSU;
import java.util.*;
class UnionFind
{
    int[] parent;
    int[] rank;
    UnionFind(int V)
    {
        parent=new int[V+1];
        rank=new int[V+1];

        for(int i=0;i<=V;i++)
        {
            parent[i]=i;
        }
    }

    int find(int node)
    {
        if(parent[node]==node)
        {
            return node;
        }
        // Path compression for efficiency
        return parent[node] = find(parent[node]);
    }

    boolean union(int u,int v)
    {
        int pu=find(u);
        int pv=find(v);
        // if parents are the same, no union needed as both are under the same leader
        if(pv==pu)
        {
            return false;
        }
        // first find the leaders and attach based on rank (attach lower rank to higher rank)
        else if(rank[pu]>rank[pv])
        {
            parent[pv]=pu;
        }
        else if(rank[pv]>rank[pu])
        {
            parent[pu]=pv;
        }
        else// if ranks are equal, attach one to the other and increase rank
        {
            parent[pv]=pu;
            rank[pu]++;
        }
        return true;

    }
}
public class UniFind {
    public static void main(String[] args) {
        UnionFind uf= new UnionFind(5);
        uf.union(1,2);
        uf.union(1,3);
        uf.union(2,4);
        if(uf.union(1,5))
        {
            System.out.println("possible");
        }
        else
        {
            System.out.println("Not possible");
        }
    }
}
