import java.util.*;
public class powNToX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextDouble();
        double n=sc.nextDouble();
        double ans = myPow(x,n);
        System.out.println("ans-->"+ans);
    }
    public static double myPow(double x, double n) 
    {
        // Base case
        if(n==0)
        return 1;
        
        if(n<0)
        {
            return 1/myPow(x, -n);
        }
        return x*(myPow(x, n-1));
    }
}
