import java.util.*;
public class minDays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int n=sc.nextInt();
        System.out.println("Enter a number of bouquet");
        int m = sc.nextInt();
        System.out.println("Enter no. of consicutive flower should take");
        int k=sc.nextInt();
        int[] bloomDay=new int[n];
        System.out.println("Bloomdays array");
        for(int i=0;i<n;i++)
        {
            bloomDay[i]=sc.nextInt();
        }
        int ans = ansDays(bloomDay,m,k);
        System.out.println("ans"+" "+ans);
    }


    public static int ansDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)return -1;
        int max =Arrays.stream(bloomDay).max().getAsInt();
        for(int i=1;i<=max;i++)
        {
            for(int j=0;j<bloomDay.length;j++)
            {
                if(bloomDay[j]<=i)
                {
                    bloomDay[j]=0;
                }
            }
            int count=0;
            int ans=0;
            for(int n=0;n<bloomDay.length;n++)
            {
                if(bloomDay[n]==0)
                {
                    count++;
                }
                else
                {
                    ans =ans+(count/k);
                    count=0;
                }
            }
            ans =ans+(count/k);
            if(ans >= m)
            {
                return i;
            }
        }
        return -1;
    }

}