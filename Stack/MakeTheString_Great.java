import java.util.ArrayDeque;
import java.util.Scanner;

public class MakeTheString_Great {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        String ans = makeGood(s);
        System.out.println("ans-->"+ans); 
    }
    public static  String makeGood(String s) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        
        if(s.isEmpty())
        {
            return "";
        }
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(!st.isEmpty())
            {
                char c =st.peek();
                if(Math.abs((int)c-(int)s.charAt(i))==32)
                {
                    c=st.pop();
                    continue;
                }
            }
            st.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            char ch=st.pop();
           // System.out.println("stack-->"+ch);
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
