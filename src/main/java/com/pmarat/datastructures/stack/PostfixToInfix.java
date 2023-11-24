package com.pmarat.datastructures.stack;

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
            // Push operands
            if (Character.isLetterOrDigit(exp.charAt(i))) {
                s.push(exp.charAt(i) + "");
            }

            // We assume that input is
            // a valid postfix and expect
            // an operator.
            else {
                String op1 = s.pop();
                String op2 = s.pop();
                s.push("(" + op2 + exp.charAt(i) +
                        op1 + ")");
            }
        }

        // There must be a single element
        // in stack now which is the required
        // infix.
        return s.peek();
    }
}
