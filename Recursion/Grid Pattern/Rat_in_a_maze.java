import java.util.*;

public class Rat_in_a_maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example input size
        int n = sc.nextInt(); 
        int[][] maze = new int[n][n];
        
        // Taking maze input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        
        Solution sol = new Solution();
        ArrayList<String> result = sol.ratInMaze(maze);
        
        if (result.size() == 0)
            System.out.println("No path found");
        else
            for (String path : result) 
                System.out.println(path);
    }
}

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int m = maze.length;
        int n = maze[0].length;
        ArrayList<String> arr = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];
        
        // if starting cell is blocked
        if (maze[0][0] == 0) return arr;
        
        fun(maze, arr, 0, 0, visited, "");
        return arr;
    }

    public void fun(int[][] maze, ArrayList<String> arr, int i, int j, boolean[][] visited, String st) {
        int m = maze.length;
        int n = maze[0].length;

        // invalid cell
        if (i < 0 || j < 0 || j >= n || i >= m || maze[i][j] == 0 || visited[i][j]) {
            return;
        }

        // destination reached
        if (i == m - 1 && j == n - 1) {
            arr.add(st);
            return;
        }

        visited[i][j] = true;

        // exploring in lexicographically smallest order → D, L, R, U
        fun(maze, arr, i + 1, j, visited, st + "D");
        fun(maze, arr, i, j - 1, visited, st + "L");
        fun(maze, arr, i, j + 1, visited, st + "R");
        fun(maze, arr, i - 1, j, visited, st + "U");

        visited[i][j] = false;
    }
}
