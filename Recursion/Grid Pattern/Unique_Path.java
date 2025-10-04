import java.util.Scanner;

public class Unique_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int ans =uniquePaths(m,n);
        System.out.println("ans->"+ans);

    }
     public static int uniquePaths(int m, int n) {
        
        int val=fun(m, n, 0, 0);
        return val;
    }
    public static int fun(int m , int n,int i,int j)
    {
        // Invalid case
        if(i>=m || j>=n)
        {
            return 0;
        }
        // Base case
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        // Recursive class
        int a=fun(m,n,i,j+1);
        int b=fun(m,n,i+1,j);
        return a+b;
    }
}

