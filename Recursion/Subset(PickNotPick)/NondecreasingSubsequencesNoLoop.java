// import java.util.*;

// public class NondecreasingSubsequences {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
        
//         List<List<Integer>> res = findSubsequences(nums);
//         System.out.println("Resulting subsequences:");
//         System.out.println(res);
//         sc.close();
//     }

//     public static List<List<Integer>> findSubsequences(int[] nums) {
//         // Use a Set to automatically handle duplicate subsequences.
//         Set<List<Integer>> resultSet = new HashSet<>();
//         // This list will store the subsequence being built.
//         List<Integer> path = new ArrayList<>();
        
//         backtrack(nums, 0, path, resultSet);
        
//         // Convert the Set to a List for the final output.
//         return new ArrayList<>(resultSet);
//     }

 
//     public static void backtrack(int[] nums, int index, List<Integer> path, Set<List<Integer>> resultSet) {
//         // 1. Condition: If the current path is a valid subsequence (length >= 2), add it to our result set.
//         if (path.size() >= 2) {
//             // Add a copy, otherwise the list in the set will be changed by backtracking.
//             resultSet.add(new ArrayList<>(path));
//         }

//         // 2. Explore: Iterate through the array starting from the current index.
//         for (int i = index; i < nums.length; i++) {
//             // 3. Constraint: Only proceed if the path is empty (first element) or
//             //    if the current number is >= the last number added to the path.
//             //    This enforces the "non-decreasing" rule.
//             if (path.isEmpty() || nums[i] >= path.get(path.size() - 1)) {
                
//                 // === Pick ===
//                 // Add the current number to the path.
//                 path.add(nums[i]);
                
//                 // Recurse: Call the function for the next index.
//                 backtrack(nums, i + 1, path, resultSet);
                
//                 // === Backtrack (Un-pick) ===
//                 // Remove the number we just added so we can explore other possibilities.
//                 // This is the crucial backtracking step.
//                 path.remove(path.size() - 1);
//             }
//         }
//     }
// }

//two way pick or not pick and loop both are correct

import java.util.*;

public class NondecreasingSubsequencesNoLoop {

    public static List<List<Integer>> findSubsequences(int[] nums) {
        // A Set is still the best way to handle duplicate subsequences automatically.
        Set<List<Integer>> resultSet = new HashSet<>();
        List<Integer> path = new ArrayList<>();
        
        backtrack(nums, 0, path, resultSet);
        
        return new ArrayList<>(resultSet);
    }

  
    private static void backtrack(int[] nums, int index, List<Integer> path, Set<List<Integer>> resultSet) {
        // Base Case: If we have considered all the numbers in the array.
        if (index == nums.length) {
            // If the path we built has 2 or more elements, it's a valid answer.
            if (path.size() >= 2) {
                resultSet.add(new ArrayList<>(path));
            }
            return;
        }

        // --- BRANCH 1: PICK the current element ---
        // We can only pick nums[index] if it maintains the non-decreasing order.
        if (path.isEmpty() || nums[index] >= path.get(path.size() - 1)) {
            // 1. Pick the element
            path.add(nums[index]);
            // 2. Recurse for the next index
            backtrack(nums, index + 1, path, resultSet);
            // 3. Backtrack (un-pick) to revert the state for the other branch
            path.remove(path.size() - 1);
        }

        // --- BRANCH 2: DON'T PICK the current element ---
        // Recurse for the next index without adding the current element.
        backtrack(nums, index + 1, path, resultSet);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> result = findSubsequences(nums);
        // Sort for consistent output display
        result.forEach(Collections::sort);
        result.sort(Comparator.comparing(Object::toString));
        System.out.println(result);
        // Expected: [[4, 6], [4, 6, 7], [4, 6, 7, 7], [4, 7], [4, 7, 7], [6, 7], [6, 7, 7], [7, 7]]
    }
}