import java.util.*;
public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<ArrayList<Integer>>  nums= new ArrayList<>();
        // int rows=sc.nextInt();
        // for(int i=0;i<rows;i++)
        // {
        //     ArrayList<Integer> row= new ArrayList<>();
        //     int cols= sc.nextInt();
        //     for(int j=0;j<cols;j++)
        //     {
        //         row.add(sc.nextInt());
        //     }
        //     nums.add(row);
        // }
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        } 
        
        List<List<Integer>>ans =subsets(nums);
        System.out.println("ans->"+ans);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        fun(nums, 0, ans, path);
        return ans;
    }
    public static void fun(int[] nums,int idx,List<List<Integer>> ans,ArrayList<Integer> path) {
        // Base case
        if(idx==nums.length)
        {
            ans.add(new ArrayList<Integer>(path));
            return;
        }
        // Not pick condition
        fun(nums, idx+1, ans, path);
        // Pick condition
        path.add(nums[idx]);
        fun(nums, idx+1, ans, path);
        // backtrack Condition
        path.remove(path.size()-1); 
        
    }
}
