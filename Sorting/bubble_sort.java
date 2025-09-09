import java.util.*;

public class bubble_sort {
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("size");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size-1;i++)
        {
           // int max = arr[i];
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1] ;
                    arr[j+1] =temp;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        
        }
   } 
}
