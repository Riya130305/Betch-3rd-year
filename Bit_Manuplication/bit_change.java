
import java.util.*;
public class bit_change {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("testcase");
        int t=sc.nextInt();

        while(t-- > 0)
        {
            System.out.println("n1");
            int n1 = sc.nextInt();

            // System.out.println("n2");
            // int n2 = sc.nextInt();

            int result = change(n1);
            System.out.println("count"+result);
        }


    }
    public static int change(int n1)
    {
        int count=0;
        while(n1!=0)
        {
            n1=(n1& (n1-1));
            count++;
        }
        return count;
    }
}
