import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int t1=nextInt();
            int t2=nextInt();
            int t3=nextInt();
            System.out.println(t1+" "+t2+" "+t3);
            int max=maxi(t1,t2,t3);
            System.out.println(max);
        }
    }
    public Static int maxi(int t1,int t2, int t3){
        // int m=Math.max(t1,Math.max(t2,t3));
        int m=0;
        if(m1>m){
            m=m1;
        }
        if(t1>m){
            m=t1;
        }
        if(t2>m){
            m=t2;
        }
        if(t3>m){
            m=t3;
        }
        return m;
    }
}