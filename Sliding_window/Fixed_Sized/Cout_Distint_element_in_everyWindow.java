import java.util.*;

class Cout_Distint_element_in_everyWindow {

    ArrayList<Integer> countDistinct(int arr[], int k) {
        int s = 0, e = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        while (e < arr.length) {
            map.put(arr[e], map.getOrDefault(arr[e], 0) + 1);

            if (e - s + 1 == k) {
                ans.add(map.size());
                map.put(arr[s], map.get(arr[s]) - 1);
                if (map.get(arr[s]) == 0) {
                    map.remove(arr[s]);
                }
                s++;
            }
            e++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Cout_Distint_element_in_everyWindow sol = new Cout_Distint_element_in_everyWindow();
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        ArrayList<Integer> result = sol.countDistinct(arr, k);
        System.out.println(result);
    }
}
