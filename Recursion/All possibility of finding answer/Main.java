import java.util.*;

public class Main {
    static int n;
    static char[][] grid;

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    static void dfs(int x, int y, boolean[][] visited) {
        visited[x][y] = true;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (isValid(nx, ny) && grid[nx][ny] == '#' && !visited[nx][ny])
                dfs(nx, ny, visited);
        }
    }

    static boolean connected() {
        boolean[][] visited = new boolean[n][n];
        int cnt = 0;
        int sx = -1, sy = -1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == '#') {
                    cnt++;
                    sx = i;
                    sy = j;
                }
        if (cnt == 0) return false;
        dfs(sx, sy, visited);
        int seen = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == '#' && visited[i][j])
                    seen++;
        return seen == cnt;
    }

    static boolean threeConsecutive() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j + 2 < n; j++)
                if (grid[i][j] == '#' && grid[i][j + 1] == '#' && grid[i][j + 2] == '#')
                    return true;
        for (int j = 0; j < n; j++)
            for (int i = 0; i + 2 < n; i++)
                if (grid[i][j] == '#' && grid[i + 1][j] == '#' && grid[i + 2][j] == '#')
                    return true;
        return false;
    }

    static boolean possible() {
        if (threeConsecutive()) return false;
        if (connected()) return true;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == '.') {
                    grid[i][j] = '#';
                    if (!threeConsecutive() && connected()) {
                        grid[i][j] = '.';
                        return true;
                    }
                    grid[i][j] = '.';
                }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // System.out.println("n-->");
            n = sc.nextInt();
            grid = new char[n][n];
            for (int i = 0; i < n; i++)
                grid[i] = sc.next().toCharArray();
            System.out.println(possible() ? "YES" : "NO");
        }
    }
}
