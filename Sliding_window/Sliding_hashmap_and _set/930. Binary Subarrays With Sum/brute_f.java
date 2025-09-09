import java.util.*;
public class brute_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int n=sc.nextInt();
        System.out.println("Enter your goal");
        int goal=sc.nextInt();
        System.out.println("Input the binary array");
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int count=0;
        ArrayList<List<Integer>> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> temp = new ArrayList<>(); 
            
            for(int j=i;j<n;j++)
            {
                int sum=0;
                temp.add(nums[j]); 
                System.out.println("temp"+" "+temp);
                for(int k=0;k<temp.size();k++){
                sum=sum+temp.get(k);
                if(sum>goal)
                {
                    break;
                }
            }
            if(sum==goal)
            count++;
            System.out.println("count"+" "+count);
                arr.add(new ArrayList<>(temp));    
            }
            System.out.println(arr);
        }

        // SAME CODE AS ABOVE BUT IN DIFFERENT LOOP

        // int count=0;
        // for(int i=0;i<arr.size();i++)
        // {
        //     int sum=0;
        //     for(int j=0;j<arr.get(i).size();j++)
        //     {
        //         // System.out.println("arr"+" "+arr.get(i).get(j));
        //         sum=sum+arr.get(i).get(j);
        //         // System.out.println("sum"+" "+sum);
        //         if(sum>goal)
        //         break;
        //     }
        //     if(sum==goal)
        //         {
        //             count++;
        //         }
        // }
        System.out.println("count"+" "+count);
    }
}
