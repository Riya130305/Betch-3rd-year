package NGE;
import java.util.*;
public class nge {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr={2,4,3,4,0};
        int[] ans = greater(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
    public static int[] greater(int[] arr)
    {
        int[] ans=new int[arr.length];
        // int k=0;
        for(int i=0;i<arr.length-1;i++)
        {
            boolean a = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    ans[i]=arr[j];
                    a=true;
                    break;
                }
            }
            if(a==false)
            {
                ans[i]=-1;
            }
        }
        ans[arr.length-1]=-1;
        return ans;
    }
}