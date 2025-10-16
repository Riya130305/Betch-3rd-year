import java.util.*;
public class N_queen{
    public static void main(String[] args) {
        int n=4;
        List<List<String>> ans = queen(n);
        System.out.println("ans-->"+ans);
    }
    public static List<List<String>>queen(int n)
    {
        List<List<String>> arr = new ArrayList<>();
        //List<String> path = new ArrayList<>();
        String[][] grid=new String[n][n];//O(n*n)
        for(String[] i:grid)
        {
            Arrays.fill(i,".");
        }
        fun(n,arr,grid,0); 
        return arr;
    }
    public static void fun(int n,List<List<String>> arr, String[][]grid,int row )
    {
       
        // valid case;
        if(n==row)
        {
            List<String>path=new ArrayList<>();
            for(String[] r:grid)
            {
                path.add(String.join("",r));
            }
            arr.add(path);
            return;
        }
        for(int col=0;col<n;col++)//O(n)
        {
            if(isSafe(grid,row,col))
            {
                grid[row][col]="Q";
                fun(n, arr, grid, row+1);
                // backtrack
                grid[row][col]=".";
            }
            
        }
        // int[] row={-1,0,1,0,-1,1,1,-1};
        // int[] col={0,1,1,-1,-1,1,-1,-1};
        // for(int r=0;r<row.length;r++)
        // {
        //     for(int c=0;c<col.length;c++)
        //     {
        //         path.add("Q");
        //         fun(n, arr, path, grid, r+1,c+1);
        //         path.remove(path.size()-1);
        //     }
        // }
    }
    public static boolean isSafe(String[][] grid,int row,int col)
    {
        // vertical
        for(int c=row-1;c>=0;c--)
        {
            if(grid[c][col].equals("Q"))
            return false;
        }
        // upper left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(grid[i][j].equals("Q"))
            return false;
        }
         // upper rigth
        for(int i=row-1,j=col+1;i>=0 && j<grid[0].length;i--,j++)
        {
            if(grid[i][j].equals("Q"))
            return false;
        }
        return true;
        //t.c =O(n!*n)
        //s.c =O(n*n)
    }

}