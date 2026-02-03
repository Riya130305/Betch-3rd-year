import java.util.*;
public class sieve_of_eratosthenes {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            Solution s=new Solution();
            System.out.println("Enter the the size");
            int size=sc.nextInt();
            ArrayList<Integer> arr= s.prime(size);
            for(int i:arr){
                System.out.println(i); 
            }
            System.out.println();
        }
    }
}
//Study by https://www.youtube.com/watch?v=dyrRM8dTEus
class Solution{
    ArrayList<Integer> prime(int n){
          //Sives of elothosesther
    boolean[] isPrime=new boolean[n+1];
    Arrays.fill(isPrime,true);
    isPrime[0]=false;
    isPrime[1]=false;
    for(int i=2;i*i<=n;i++)
    {
        //2*i to check the direct multilp of 2*2 ..2*3(means second digit of table)
        for(int j=2*i;j<=n;j+=i)//j+=i to direct jump to there multiple
        {
            isPrime[j]=false;
        }
    }
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<isPrime.length;i++)
    {
        if(isPrime[i]==true)
        {
            arr.add(i);
        }
    }
    return arr;
    }
}


   