import java.util.*;
public class Subset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
         for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        } 
        Arrays.sort(nums);
        List<List<Integer>>ans =subsetsWithDup(nums);
        System.out.println("ans->"+ans);
    }
     public static List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        fun(nums, 0, ans, path);
        return ans;
    }
    public static void fun(int[] nums,int idx,List<List<Integer>> ans,ArrayList<Integer> path)
    {
        // Base caseif()
        // if(idx==nums.length )
        // {
        //     ans.add(new ArrayList<Integer>(path));
        //     return;
        // }
        ans.add(new ArrayList<>(path));
        for (int i = idx; i < nums.length; i++) {
            
            // If this is not the first element in our current consideration (i > idx)
            // AND the current element is the same as the previous one (nums[i] == nums[i-1]),
            // then skip it to avoid creating a duplicate subset.
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            // Pick the element
            path.add(nums[i]);
            // Recurse for the next elements
            fun(nums, i + 1, ans, path);
            // Backtrack (un-pick the element)
            path.remove(path.size() - 1);
        }    

    }
}
