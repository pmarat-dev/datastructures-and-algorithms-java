package com.pmarat.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.System.out;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        out.println(infixToPostfix(exp));
    }

    // Time Complexity: O(N)
    // Auxiliary Space: O(N)
    private static String infixToPostfix(String exp) {
        // Initializing empty String for result
        StringBuilder result = new StringBuilder();

        // Initializing empty stack
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result.append(c);

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                // If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    result.append(stack.pop());
                    //stack.pop();
                }

                stack.pop();
            }

            // An operator is encountered
            else {
                while (!stack.isEmpty()
                        && precedence(c) <= precedence(stack.peek())) {

                    result.append(stack.peek());
                    stack.pop();
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result.append(stack.peek());
            stack.pop();
        }

        return result.toString();
    }

    private static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
}
