import java.util.*;

public class Max_sum_subarray_of_sizeK {
    
    // Function to calculate maximum subarray sum of size k
    public static int maxSubarraySum(int[] arr, int k) {
        // Sliding window approach
        int s = 0;
        int e = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        while (e < arr.length) {
            sum += arr[e];
            
            // If window size exceeds k, shrink from left
            if (e - s + 1 > k) {
                sum -= arr[s];
                s++;
            }
            
            // Update max only when window size is k
            if (e - s + 1 == k) {
                max = Math.max(sum, max);
            }
            
            e++;
        }
        return max;
    }
    
    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter k (window size): ");
        int k = sc.nextInt();
        
        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum subarray sum of size " + k + " = " + result);
        
        sc.close();
    }
}
