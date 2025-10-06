import java.util.Scanner;

public class Unique_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int ans =uniquePaths(m,n);
        System.out.println("ans->"+ans);

    }
     public static int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];          // initialize memo array
    for(int[] row : dp) Arrays.fill(row, -1); // -1 means not computed
    return fun(m, n, 0, 0, dp);
}

public static int fun(int m, int n, int i, int j, int[][] dp) {
    // Out of bounds
    if(i >= m || j >= n) return 0;
    
    // Reached destination
    if(i == m-1 && j == n-1) return 1;
    
    // Check memo
    if(dp[i][j] != -1) return dp[i][j];
    
    // Recursive calls
    int right = fun(m, n, i, j+1, dp);
    int down  = fun(m, n, i+1, j, dp);
    
    dp[i][j] = right + down; // store in dp
    return dp[i][j];
}

}

