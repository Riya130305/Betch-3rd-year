import java.util.*;
public class kClosePointToOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k");
        int k=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Ennter points");
        int[][] points= new int[n][2];
        for(int i=0;i<points.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                points[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ennter end");

        int[][] ans =maxHeap(points,k);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("ans-->"+ans[i][j]);
            }
        }

    }
    public static int[][] maxHeap(int[][] points,int k){
        // int [][] ans = new int[k][2];
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        
        for(int[] point:points)
        {
            pq.add(point);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        // int[][] ans = new int[k][2];
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        
        return result;

    }
}
