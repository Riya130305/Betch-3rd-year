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
class Solution{
    ArrayList<Integer> prime(int n){
        ArrayList<Integer> arr1= new ArrayList<>();
        boolean[] p=new boolean[n+1];
        Arrays.fill(p,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(p[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                p[j]=false;
            }
        }
    }

        for(int i=2;i<=n;i++){
           if(p[i]==true){
            arr1.add(i);
           }   
        }
        return arr1;
    }
}


   