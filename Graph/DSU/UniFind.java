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
        // RECURSIVLEY CALL KARNA HAI PARENT
        return find(parent[node]);
    }

    boolean union(int u,int v)
    {
        int pu=find(u);
        int pv=find(v);
        // if parent are same so we will not do any union(ki dono already es ho leader ke andder hai)
        if(pv==pu)
        {
            return false;
        }
        // phle leader tk jaao and then rank ke according attach kaaro(jada rank ke neeche kam rank wala add ho jaaega) 
       else if(rank[pu]>rank[pv])
        {
            parent[pv]=pu;
        }
        else if(rank[pv]>rank[pu])
        {
            parent[pu]=pv;
        }
        else//if rank is same toh kisi ko bhi kisi ke sath add krdo
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
        // uf.union(1,2);
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
