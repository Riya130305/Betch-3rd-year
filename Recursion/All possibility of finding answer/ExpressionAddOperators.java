import java.util.ArrayList;
import java.util.List;

// Main class to run the solution
public class ExpressionAddOperators {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // --- Example Usage ---
        String nums = "105";
        int target = 5;

        List<String> result = sol.addOperators(nums, target);
        System.out.println(result); // Expected output: [1*0+5, 10-5]
    }
}

class Solution {
    private List<String> ans;

    public List<String> addOperators(String s, int target) {
        this.ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return ans;
        }
        dfs(0, "", 0, 0, s, target);
        return ans;
    }

    private void dfs(int i, String path, long resSoFar, long prevNum, String s, int target) {
        if (i == s.length()) {
            if (resSoFar == target) {
                ans.add(path);
            }
            return;
        }

        for (int j = i; j < s.length(); j++) {
            // Skip numbers with leading zeros, like "05"
            if (j > i && s.charAt(i) == '0') {
                break;
            }

            long currNum = Long.parseLong(s.substring(i, j + 1));

            if (i == 0) {
                // First number, no operator
                dfs(j + 1, path + currNum, currNum, currNum, s, target);
            } else {
                dfs(j + 1, path + "+" + currNum, resSoFar + currNum, currNum, s, target);
                dfs(j + 1, path + "-" + currNum, resSoFar - currNum, -currNum, s, target);
                
                // Handle multiplication by undoing the previous operation
                dfs(j + 1, path + "*" + currNum, resSoFar - prevNum + prevNum * currNum, prevNum * currNum, s, target);
            }
        }
    }
}