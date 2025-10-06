public class Find_the_town_judge {
    public static void main(String[] args) {
        int n=4;
        int[][] trust={{1,3},{2,3},{4,3}};
        int ans = findJudge(n,trust);
        System.out.println("ans->",ans);
    }
    public static int findJudge(int n, int[][] trust) {
        // graph like approch 
        int l=trust.length;
        if(l<n-1)
        {
            return -1;
        }
        int[] out = new int[n+1];
        int[] in=new int[n+1];
        for(int i=0;i<l;i++)
        {
            out[trust[i][0]]++;
            in[trust[i][1]]++;
        }
        for(int i=1;i<out.length;i++)
        {
            if(out[i]==0 && in[i]==n-1)
            {
                return i;
            }
        }
        return -1;
    }
}
