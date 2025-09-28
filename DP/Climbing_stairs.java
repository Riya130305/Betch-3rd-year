import java.util.*;

public class Climbing_stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n+1];
        Arrays.fill(arr,-1);
        int ans = fib(n,arr);
        System.out.println("ans-->"+ans);
    }
    public static int fib(int n ,int[] arr)
    {
        if(n<=3)
        {
            return n;
        }
        if(arr[n]!=-1)
        {
            return  arr[n];
        }
        arr[n]=fib(n-1,arr)+fib(n-2,arr);
        return arr[n];
    }
}
