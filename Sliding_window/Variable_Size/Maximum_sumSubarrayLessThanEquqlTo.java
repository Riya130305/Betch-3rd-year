import java.util.*;

public class Maximum_sumSubarrayLessThanEquqlTo {
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

        // Input x
        System.out.print("Enter value of x: ");
        long x = sc.nextLong();

        // Call solution function
        Solution sol = new Solution();
        long result = sol.findMaxSubarraySum(arr, x);

        // Output result
        System.out.println("Maximum subarray sum <= " + x + " is: " + result);

        sc.close();
    }
}

// User-defined Solution class
class Solution {
    public long findMaxSubarraySum(int[] arr, long x) {
        int s = 0;
        int e = 0;
        long sum = 0;   // sum should be long (not int) because x is long
        long max = Long.MIN_VALUE;

        while (e < arr.length) {
            sum += arr[e];

            // shrink window if sum exceeds x
            while (sum > x && s <= e) {
                sum -= arr[s];
                s++;
            }

            max = Math.max(max, sum);
            e++;
        }
        return max;
    }
}
