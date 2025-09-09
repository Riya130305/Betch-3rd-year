import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Function to find all possible paths
    public static boolean isValid(ArrayList<ArrayList<Integer>> mat, int rows, int cols, int sr, int sc, int[][] visited) {
        if (sr >= 0 && sr < rows && sc >= 0 && sc < cols && mat.get(sr).get(sc) == 1 && visited[sr][sc] == 0) {
            return true;
        }
        return false;
    }

    public static void Helper(int sr, int sc, int tr, int tc, int rows, int cols, ArrayList<ArrayList<Integer>> mat, ArrayList<String> ans, int[][] visited, String s) {
        if (sr == tr && sc == tc) {
            ans.add(s);
            return;
        }
        int[] dr = {-1, 1, 0, 0}; // Row movement: Up, Down
        int[] dc = {0, 0, -1, 1}; // Column movement: Left, Right
        char[] c = {'U', 'D', 'L', 'R'}; // Corresponding directions

        if (isValid(mat, rows, cols, sr, sc, visited)) {
            visited[sr][sc] = 1; // Mark as visited
            for (int i = 0; i < 4; i++) {
                Helper(sr + dr[i], sc + dc[i], tr, tc, rows, cols, mat, ans, visited, s + c[i]);
            }
            visited[sr][sc] = 0; // Unmark for backtracking
        }
    }

    // Function to find all possible paths from top-left to bottom-right
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> ans = new ArrayList<>();
        int row = mat.size();
        int col = mat.get(0).size();
        int[][] visited = new int[row][col];
        Helper(0, 0, row - 1, col - 1, row, col, mat, ans, visited, "");
        Collections.sort(ans); // Sorting paths lexicographically
        return ans;
    }

    public static void main(String[] args) {
        // Predefined Input Matrix
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<Integer>() {{ add(1); add(0); add(0); add(0); }});
        mat.add(new ArrayList<Integer>() {{ add(1); add(1); add(0); add(1); }});
        mat.add(new ArrayList<Integer>() {{ add(1); add(1); add(0); add(0); }});
        mat.add(new ArrayList<Integer>() {{ add(0); add(1); add(1); add(1); }});

        // Call the function to find paths
        ArrayList<String> result = findPath(mat);

        // Output all possible paths
        if (result.isEmpty()) {
            System.out.println("No Path Found");
        } else {
            System.out.println("Possible Paths:");
            for (String path : result) {
                System.out.println(path);
            }
        }
    }
}
