import java.util.Scanner;

public class Max_sum_without_Adjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans = findMaxSum(arr);
        System.out.println("ans-->"+ans);
    }
   
    public static int findMaxSum(int arr[]) {
        // code here
        int[] M= new int[arr.length];
        if(M.length==1)
        {
            return arr[0];
        }
        if(M.length==2)
        {
            int a=Math.max(arr[0],arr[1]);
            return a;
        }
        if(M.length>2){
            M[0]=arr[0];
               
            M[1]=Math.max(arr[0],arr[1]);
        }
        
        for(int i=2;i<arr.length;i++)
        {
            M[i]=Math.max(M[i-2]+arr[i],M[i-1]);
        }
        return M[arr.length-1];
    }
}

