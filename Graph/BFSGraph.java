import java.util.*;
public class BFSGraph {
    static void bfs_mat(int[][] mat,int sr,int sc,int rows,int cols,boolean[][] visited){
        // Assign queue
        Queue<int[]>q=new LinkedList<>();
        // Mark it as visited
        visited[sr][sc]=true;
        // adding pair to the queue
        q.add(new int[]{sr,sc});
        // Repeat the queue until it is not empty
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int curr_row=curr[0];
            int curr_col=curr[1];
            System.out.print(mat[curr_row][curr_col]+"-->");

            int dr[]={0,1,0,-1};
            int dc[]={1,0,-1,0};

            for(int i=0;i<dr.length;i++){
                int nbr_col=curr_col+dc[i];
                int nbr_row=curr_row+dr[i];
                if(isValid(nbr_row,nbr_col,rows,cols,visited,mat)){
                    visited[nbr_row][nbr_col]=true;
                    q.add(new int[]{nbr_row,nbr_col});
                }
            }
        }
    }

    static boolean isValid(int n_r,int n_c,int rows,int cols,boolean[][] visited,int[][] mat){
        if(n_r>=0 && n_r<rows && n_c>=0 && n_c<cols && !visited[n_r][n_c]){
            return true;
        }
        return false;
    }

    static void bfs_all(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && mat[i][j]==1){

                    bfs_mat(mat,i,j,m,n,visited);
                }
            }
        }
    }
    public static void main(String args[]){
        int[][]mat={
            {1,1,0,0},
            {0,1,0,1},
            {1,1,1,1},
            {1,1,0,1}
        };
        int m=mat.length;
        int n=mat[0].length;
        boolean[][] visited=new boolean[m][n];
        bfs_mat(mat,0,0,m,n,visited);
    }


}