import java.util.*;

public class Bird_and_maximum_fruit_gathering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input totalTime (window size)
        System.out.print("Enter totalTime: ");
        int totalTime = sc.nextInt();

        // Call solution function
        Solution sol = new Solution();
        int result = sol.maxFruits(arr, totalTime);

        // Output result
        System.out.println("Maximum fruits collected in " + totalTime + " time is: " + result);

        sc.close();
    }
}

// User-defined Solution class
class Solution {
    public int maxFruits(int[] arr, int totalTime) {
        int s = 0;
        int e = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (e < arr.length) {
            sum += arr[e];

            // If window size > totalTime, shrink window
            if (e - s + 1 > totalTime) {
                sum -= arr[s];
                s++;
            }

            max = Math.max(max, sum);
            e++;
        }
        return max;
    }
}
