package NGE;
import java.util.*;
public class ngeOp {
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
        Stack<Integer> st = new Stack<>();
        int ans[]= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty())
            {
                st.push(arr[i]);
            }

            else if(st.peek() < arr[i])
            {
                ans[i]=arr[i];
            }
            else
            {
                ans[i]=-1;
            }
        }
        return ans;
    }
}