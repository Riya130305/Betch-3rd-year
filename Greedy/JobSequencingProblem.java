import java.util.*;
public class JobSequencingProblem {
    public static void main(String[] args) {
        int[] deadline={1,3,4,1,3,4};
        int[] profit={30,30,25,25,25,20};
        ArrayList<Integer> res=jobSequencing(deadline,profit);
        System.out.println("res-->"+res);
    }
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int size=Arrays.stream(deadline).max().getAsInt();
        // 1 based indexing that's why +1
        int[] arr = new int[size+1];
        int[][] job=new int[n][2];
        for(int i=0;i<n;i++)
        {
            job[i][0]=deadline[i];
            job[i][1]=profit[i];
        }
        Arrays.sort(job,(a,b)->(b[1]-a[1]));
        // Arrays.sort(job,new Comparator<int[]>() {
        //     public int compare (int[] a, int[] b)
        //     {
        //         return b[1]-a[1];
        //     }
        // });
        int sum=0;
        // ArrayList<Integer> ans = new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int d=job[i][0];
            int p=job[i][1];
            for(int j=d;j>0;j--)
            {
                if(arr[j]==0)
                {
                    arr[j]=1;
                    count++;
                    sum+=p;
                    break;
                }
            }

        }
        ans.add(count);
        ans.add(sum);

        return ans;

    }
}
