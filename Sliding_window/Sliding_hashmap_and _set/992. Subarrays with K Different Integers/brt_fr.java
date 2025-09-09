import java.util.*;
public class brt_fr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        System.out.println("Enter k size");
        int k=sc.nextInt();
        System.out.println("Input the array");
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int ans=subarraysWithKDistinct(nums,k);
        System.out.println("ans"+" "+ans);
    }

    public static int subarraysWithKDistinct(int[] nums, int k)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            HashMap<Integer,Integer> map=new HashMap<>(); 
            for(int j=i; j<nums.length;j++)
            {
                if(map.containsKey(nums[j]))
                {
                    map.put(nums[j],map.get(nums[j]+1));
                }
                else 
                {
                    map.put(nums[j],1);
                }
                if(map.size()>k)
                break;
                if(map.size()==k)
                {
                    max=max+1;
                }
            }
        }
        return max;
    } 
}
