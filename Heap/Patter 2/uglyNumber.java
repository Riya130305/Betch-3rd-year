
import java.util.*;

public class uglyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        boolean ans=ugl(n);
        System.out.println("ans "+ans);
      
    }

    // public static boolean ugl(int n)
    // {
    //     if(n<=0)
    //     {
    //         return false;
    //     }
    //       HashSet<Integer> set = new HashSet<>();
    //     // Code of prime factor

    //     for(int i=2;i<=Math.sqrt(n);i++)
    //     {
    //         if(n%i==0)
    //         {
    //             while(n%i==0)
    //             {
    //                 set.add(i);
    //                 n=n/i;
    //             }
                
    //         }
    //     }
    //     if(n>1)
    //     {
    //         set.add(n);
    //     }
    //     for(int i:set){
    //         // System.out.println("loop");
    //     if(i!=2 && i!=3 && i!=5)
    //     {
    //         // System.out.println("start");
    //         return false;
            
    //     }
    // }
    // System.out.println("loop end");
    //     return true;
    // }

    // Both are correct

    public static boolean ugl(int n )
    {
        if(n<=0)
        return false;

        while(n%2==0)
        {
            n=n/2;
        }
        while(n%3==0)
        {
            n=n/3;
        }
        while (n%5==0) {
            n=n/5;
        }
        if(n!=1)
        {
            return false;
        }
        return true;
    }
}