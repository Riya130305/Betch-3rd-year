public class Minimum_rotations_to_unlock_a_circular_lock {
    public static void main(String[] args) {
        long R=3658;
        long D=924;

        int ans=rotationCount(R,D);
        System.out.println("ans->"+ans);

    }
    static int rotationCount(long R, long D) {
        // code here
        long ans=0;
        
        while(R>0)
        {
            long val1=R%10;
            long val2=D%10;
            R/=10;
            D/=10;
            long abs=Math.abs(val1-val2);
            ans+=Math.min(abs,10-abs);
        }
        return  (int)ans;
    }
}
