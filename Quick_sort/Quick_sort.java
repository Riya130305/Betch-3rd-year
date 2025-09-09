//  package Quick sort;
 import java.util.*;

public class Quick_sort{
    public static void quick_sort(int[] arr,int low,int high)
    {
        if(low<=high)
        {
            int p=partition(arr,low,high);
            quick_sort(arr,low,p-1);
            quick_sort(arr,p+1,high); 
        }
    }
    public static int partition(int[] arr, int low , int high)
    {
        int i=low-1;
        int pivot=high;
        for(int j=low;j<=high;j++)
        {
            if(arr[j]<=arr[pivot])
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);// to make the space for the correct value of the pivot
        return i+1;
    }
    public static void swap(int[] arr, int i ,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,6,5,2,8};
        int n=arr.length-1;
        quick_sort(arr,0,n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
