// package Bit_Manuplication;
import java.util.*;

public class last_bit_set {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("testcase");
        int t=sc.nextInt();

        while(t-- > 0)
        {
            System.out.println("number");
            int n=sc.nextInt();

            int result=set(n);
            System.out.println("number of set bit"+result);
            
        }
    }
    public static int set( int n)
    {
        int count=0;
        while(n>0)
           { if((n & 1) == 1)
            {
                count++;
            }}
        
       return count;
    }
    
}
