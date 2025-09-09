package Merge_sort;
import java.util.*;
public class MergeSort {
    public static void mergeSorted(int[] arr, int L, int P, int R) {
        int m = P - L + 1;
        int n = R - P;

        int[] l = new int[m];
        int[] r = new int[n];

        for (int i = 0; i < m; i++) {
            l[i] = arr[L + i];
        }

        for (int j = 0; j < n; j++) {
            r[j] = arr[P + 1 + j];
        }

        int i = 0, j = 0, k = L;

        while (i < m && j < n) {
            if (l[i] < r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        while (i < m) {
            arr[k++] = l[i++];
        }

        while (j < n) {
            arr[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        // Solution sol = new Solution();
        int[] arr = {1, 3, 5, 2, 4, 6}; // sorted from 0 to 2, and 3 to 5
        mergeSorted(arr, 0, 2, 5);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]
    }
}
