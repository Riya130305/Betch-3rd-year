import java.util.*;
public class printRev {
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

    }
    public static ArrayList<Integer> fun(int n,ArrayList<Integer> arr)
    {
       if(n==0)
       {
            return arr; //step:7 return arr(empty)
       }   
       arr.add(n); //Step 1: Add first 5 arr(5)  -->Step 8 ...
       fun(n-1,arr);//Step2,3,4,5,6 -->fun(4),fun(3),fun(2),fun(1),fun(0)
       return arr; //Step 9 ...
    }
}