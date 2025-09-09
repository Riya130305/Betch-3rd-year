// // If you are using packages, include the correct package declaration
// package Recursion;

// import java.util.*;

// public class first {
//     // static int count = 0;

//     // public static void fn() {
//     //     if (count < 3) {
//     //         count++;
//     //         System.out.println("hello");
//     //         fn(); // Recursive call
//     //     }
//         public static void fn(int count)
//         {
//             if(count<3)
//             {
//                 count++;
//                 System.out.println("hello");
//                 fn(count);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         fn(0);
//     }
// }

import java.io.*;
import java.util.*;
public class Main {
public static  void print1_N (int N, ArrayList<Integer> res){
        if(N>0)
        {
            print1_N(N-1,res);
            res.add(N);
        }
        
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> res=new ArrayList<>();
      for(int i:res)
      {
        i.add(sc.nextInt())  ;
      }
        
      print1_N(0,res);
      for(Integer i: res){
                System.out.print(i+" ");
            }
            System.out.println();
    }
}
