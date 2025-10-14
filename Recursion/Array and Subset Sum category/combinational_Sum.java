import java.util.*;
public class combinational_Sum {
    public static void main(String[] args) {
        int[] candidates={2,3,5};
        int target=8;
        List<List<Integer>> ans =combinationSum(candidates,target);
        System.out.println("ans-->"+ans);
    }
     public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        fun(candidates,target,arr,path,0);
        return arr;
    }
    public static void fun(int[] candidates,int target,List<List<Integer>> arr,List<Integer> path,int i )
    {
        // base case
        if(target==0)
        {
            arr.add(new ArrayList<>(path));
            return;
        }
        if(target<0 ||i==candidates.length )
        return;
        // 2 recursive calls
        path.add(candidates[i]);
        //fun(candidates,target-candidates[i],arr,path,i+1);
        fun(candidates,target-candidates[i],arr,path,i);
        path.remove(path.size()-1);
        fun(candidates,target,arr,path,i+1);
 
    }
}
