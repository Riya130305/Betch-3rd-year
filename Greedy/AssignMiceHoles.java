import java.util.*;
public class AssignMiceHoles {
    public static void main(String[] args) {
        int[] mices={4,-4,2};
        int[] holes={4,0,5};
        int ans = assignHole(mices,holes);
        System.out.println("ans-->"+ans);
    }
    public static int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mices.length;i++)
        {
            int val=Math.abs(mices[i]-holes[i]);
            max=Math.max(val,max);
        }
        return max;   
    }
}
