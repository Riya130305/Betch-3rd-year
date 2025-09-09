import java.util.*;
import java.util.stream.IntStream;
public class FStrem{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        convert array in stream
        Arrays.stream(arr);
//        filter
        Arrays.stream(arr).filter(ele-> ele%2==0);



//                sum
        int sum=Arrays.stream(arr).sum();
        System.out.println("Sum = " + sum);
//        count
        Long count = Arrays.stream(arr).distinct().count();
        System.out.println("Unique count " + count);
//        evenadd
        int addeven = Arrays.stream(arr).filter(ele-> ele%2==0).sum();
        System.out.println("Even Add "+addeven);
//        max
        IntStream st = Arrays.stream(arr);  // we don have to write again agin Arrays.stream
        OptionalInt max = stream.max();
        System.out.println(max.getAsInt());
//        sort it does not sort the real one
        Arrays.stream(arr).sorted().forEach(var -> System.out.printf("%d",var));
        System.out.println("\n" + arr[0])

//
        String[] str = {"12","34","56","32","56"};
        addeven=Arrays.stream(str).mapToInt(Integer::parseInt).filter(ele->ele%2==0).sum();
        System.out.println(addeven);


    }
}