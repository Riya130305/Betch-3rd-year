import java.util.*;

public class CheckParentheses {

    public static boolean check(ArrayDeque<String> st) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!st.isEmpty()) {
            String ch = st.pop();
            if (ch.equals(")") || ch.equals("]") || ch.equals("}")) {
                if (stack.isEmpty()) return false;

                String top = stack.pop();
                if ((ch.equals(")") && !top.equals("(")) ||
                    (ch.equals("]") && !top.equals("[")) ||
                    (ch.equals("}") && !top.equals("{"))) {
                    return false;
                }
            } else {
                // Push opening bracket to stack
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ArrayDeque<String> st = new ArrayDeque<>();
        st.push(")");
        st.push("(");  

        System.out.println(check(st)); 
    }
}
