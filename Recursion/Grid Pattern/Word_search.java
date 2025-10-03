import java.util.*;
public class Word_search {
    public static void main(String[] args) {
        int n=3;
        int m=4;
        char[][] board = new char[][]{
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };
        String word="ABCCED";
        boolean ans = exist(board, word,n,m);
        System.out.println("ans->"+ans);
    }
    public static boolean exist(char[][] board, String word,int n ,int m)
    {
        boolean[][] visited= new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(dfs(board, word,i,j,0,visited))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word,int i ,int j,int idx,boolean[][] visited)
    {
        int n=board.length;
        int m=board[0].length;
        //Success base case
        if(idx==word.length())
        {
            return true;
        }
        // Base case(boundary case)
        if(i>n-1 || j>m-1 || i<0 || j<0)
        {
            return false;
        }
        //Mismatch word || already visited Array
        if(visited[i][j] || board[i][j]!=word.charAt(idx))
        {
            return false;
        }
        // make visited
        visited[i][j]=true;

        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};

        for(int k=0;k<4;k++)
        {
            int r=i+row[k];
            int c=j+col[k];
            if(dfs(board, word, r, c, idx+1, visited))
            {
                return true;
            }
        }
        // ✅ backtrack → unmark
        visited[i][j] = false;
        return false;
    }
}
