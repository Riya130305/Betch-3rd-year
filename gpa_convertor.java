import java.util.*;
public class gpa_convertor {
    public static void main(String args[]){
        System.out.println("No. of cources");
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr= new int[tc];
        int sum=0;
        for(int i=0;i<=tc;i++){
            System.out.println("enrter the average for the course");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avg=sum/arr.length;

        if(avg>100 && avg<90 ){
            System.out.println("A Grade")
        }
    }
}
