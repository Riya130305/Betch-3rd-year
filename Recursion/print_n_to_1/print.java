import java.util.*;
public class pr {
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