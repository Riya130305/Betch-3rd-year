import java.util.*;

public class Maximum1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();  // use nextLine so spaces stay
        System.out.println("broken");
        String brokenLetters = sc.next();
        int ans = fun(text, brokenLetters);
        System.out.println("ans --> " + ans);
    }

    public static int fun(String text, String brokenLetters) {
        int val = 0;

        for (String s : text.split(" ")) {
            boolean valid = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (s.contains(brokenLetters.charAt(i) + "")) {
                    valid = false;
                    break; // no need to check further
                }
            }
            if (valid) {
                val++;
            }
        }

        return val;
    }
}



// import java.util.*;

// public class Maximum1935{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("text");
//         String text=sc.nextLine();
//         System.out.println("broken");
//         String brokenLetters =sc.next();
//         int ans=fun(text,brokenLetters);
//         System.out.println("ans-->"+ans); 
//     }
//     public static int fun(String text,String brokenLetters )
//     {
//         // leetcoder rank
//         //em
//         int val=0;
//         for(String s:text.split(" "))
//         {
//             boolean valid=true;
//             int size = brokenLetters.length();
//             for(int i=0;i<size;i++){
//             if(!s.contains(brokenLetters.charAt(i)+""))
//             {
//                 valid=false;
//                 break;
//             }
//         }
//         if(valid)
//         {
//             val++;
//         }
//         }
//         return val;
//     }
// }