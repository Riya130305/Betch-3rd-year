import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] grid = new char[n][n];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }

            if (solve(n, grid)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        
        out.flush();
        out.close();
        sc.close();
    }

    private static boolean solve(int n, char[][] grid) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '#') {
                    if (j + 2 < n) {
                        if (grid[i][j+1] == '#' && grid[i][j+2] == '#') return false;
                        if (grid[i][j+1] == '#' && grid[i][j+2] == '.') return false;
                        if (grid[i][j+1] == '.' && grid[i][j+2] == '#') return false;
                    }
                    if (j > 0 && j + 1 < n) {
                        if (grid[i][j-1] == '.' && grid[i][j+1] == '#') return false;
                    }

                    if (i + 2 < n) {
                        if (grid[i+1][j] == '#' && grid[i+2][j] == '#') return false;
                        if (grid[i+1][j] == '#' && grid[i+2][j] == '.') return false;
                        if (grid[i+1][j] == '.' && grid[i+2][j] == '#') return false;
                    }
                    if (i > 0 && i + 1 < n) {
                        if (grid[i-1][j] == '.' && grid[i+1][j] == '#') return false;
                    }
                }
            }
        }
        return true;
    }
}
