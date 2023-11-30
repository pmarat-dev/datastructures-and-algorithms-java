package stack;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.System.out;

public class PostfixToInfix {
    public static void main(String[] args) {
        String exp = "ab*c+";
        out.println(getInfix(exp));
    }

    private static String getInfix(String exp) {
        Deque<String> s = new ArrayDeque<>();

        for (int i = 0; i < exp.length(); i++) {
            if (Character.isLetterOrDigit(exp.charAt(i))) {
                s.push(exp.charAt(i) + "");
            } else {
                String op1 = s.pop();
                String op2 = s.pop();
                s.push("(" + op2 + exp.charAt(i) +
                        op1 + ")");
            }
        }

        return s.peek();
    }
}
