import java.util.*;

public class Combinational_sum2 {
    public static void main(String[] args) {
         int[] candidates={2,3,5};
        int target=8;
        List<List<Integer>> ans =combinationSum2(candidates,target);
        System.out.println("ans-->"+ans);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);//nlog(n)
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        fun(candidates,target,ans,path,0);
        return ans;
    }
    public static void fun(int[] candidates,int target,List<List<Integer>> arr,List<Integer> path,int idx)
    {
        // base caseif(t)
        if(target==0)
        {
            arr.add(new ArrayList<>(path));
            return;
        }
        if(target<0)
        return;
        for(int i=idx;i<candidates.length;i++)
        {
            if(i>idx && candidates[i]==candidates[i-1])
            {
                continue;
            }
            path.add(candidates[i]);
            fun(candidates, target -candidates[i], arr, path, i+1);
            path.remove(path.size()-1);
            //T.C=O(2^n*n)+O(nlogn)
            //S.C=O(n)+o(n)+o(logn)
        }
    }
}
