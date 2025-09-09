import java.util.*;
public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> ans=fun(n,arr);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        } 
        // int sum=0;
        int sum=add(n);
        System.out.println("sum"+" "+sum);

        int mul=mul(n);
        System.out.println("mul"+" "+mul);


    }
    public static ArrayList<Integer> fun(int n ,ArrayList<Integer> arr){
        // Base case
        if(n==0){
            return arr;  // This function will return only form stack of fun(0)
        }
        fun(n-1,arr);
        arr.add(n); //fun(1) fun(2) fun(3)
        return arr;  // return  1 2 3
    }

    // Add the number by recursive calls
    public static int add(int n)
    {
        if(n==0)
            return 0;
        
        return n + add(n-1);
            
    }

    // Multiplication by recursive call
    public static int mul(int n)
    {
        if(n==1)
            return 1;
        
        return n*mul(n-1);    
    }


}
