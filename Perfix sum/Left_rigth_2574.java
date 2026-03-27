import java.util.*;

public class Left_rigth_2574 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        if (n == 1) return ans;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = 0;
        r[n - 1] = 0;
        if (n > 1) {
            l[1] = nums[0];
            r[n - 2] = nums[n - 1];
        }
        for (int i = 2; i < n; i++) {
            l[i] = l[i - 1] + nums[i - 1];
        }
        for (int i = n - 3; i >= 0; i--) {
            r[i] = r[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(l[i] - r[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = leftRightDifference(nums);
        System.out.println("Result:");
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        sc.close();
    }
}