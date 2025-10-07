public class Path_max_with_gold {
     int max=0;
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0)
                {
                    dfs(grid,i,j,0);
                }
            }
        }
        return max;

    }
    public void dfs(int[][]grid, int i,int j,int gold)
    {
        int n=grid.length;
        int m=grid[0].length;
        // base case
        if(i<0 || j<0 || i>=n ||j>=m ||grid[i][j]==0)
        {
            return;
        }
        int curr=grid[i][j];
        gold+=curr;
        max=Math.max(max,gold);
        grid[i][j]=0;
        // calls
        dfs(grid,i-1,j,gold);
        dfs(grid,i,j+1,gold);
        dfs(grid,i+1,j,gold);
        dfs(grid,i,j-1,gold);
        // backtrack
        grid[i][j]=curr;

    }
}
