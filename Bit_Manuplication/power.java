import java.util.*;

public class power {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ending");
        int e=sc.nextInt();

        if(pow(e)==1)
        System.out.println("power of 2");
        else
        System.out.println("not");
        

    }  
    public static int pow(int e)
    {
        int count=0;
        while(e>0)
        {
            if(e%1==1)
            {
                count++;
            }
            e=e/2;
            
        }
        return count;

    }  
}
