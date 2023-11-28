package datastructures.stack;

import static java.lang.System.out;

public class CustomStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("red");
        stack.push("green");
        stack.push("blue");

        out.format("peek: %s%n", stack.peek());
        out.format("pop: %s%n", stack.pop());
        out.format("pop: %s%n", stack.pop());
        out.format("pop: %s%n", stack.pop());
    }
}

class Stack<T> {
    Node<T> top;

    void push(T t) {
        Node<T> node = new Node<>(t);
        node.link = top;
        top = node;
    }

    T pop() {
        T data = top.data;
        top = top.link;
        return data;
    }

    T peek() {
        return top.data;
    }

    private static class Node<T> {
        public Node(T data) {
            this.data = data;
        }

        T data;
        Node<T> link;
    }
}