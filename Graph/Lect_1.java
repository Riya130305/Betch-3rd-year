import java.util.*;
class Lect_1{


static void traverse(int[][] mat, int cr, int cc, int rows, int cols,boolean[][] visited) {
    if (cr < 0 || cc < 0 || cr >= rows || cc >= cols ||  mat[cr][cc]==0 || visited[cr][cc]==true) {
        return;
    }

    visited[cr][cc]=true;
    int[] dr={0,1,0,-1};
    int[] dc ={1,0,-1,0};
    System.out.print(cr +" , "+cc);
    for(int i=0;i<dr.length;i++){
        traverse(mat, dr[i]+cr, dc[i]+cc, rows, cols,visited);

    }
    // traverse(mat, cr, cc+1, rows, cols,visited);
    // traverse(mat, cr+1, cc, rows, cols,visited);
    // traverse(mat, cr, cc-1, rows, cols,visited);
    // traverse(mat, cr-1, cc, rows, cols,visited);


}

    public static void main(String args[]){
        // int[][]mat={
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
         int[][]mat={
            {1,0,0,1},
            {1,0,0,1},
            {1,0,0,1},
            {1,1,1,1}
        };
        int m=mat.length;
        int n=mat[0].length;
        boolean[][] visited=new boolean[m][n];
        traverse(mat,0,0,m,n,visited);
    }
}