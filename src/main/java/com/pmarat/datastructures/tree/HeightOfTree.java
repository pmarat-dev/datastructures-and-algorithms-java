package com.pmarat.datastructures.tree;

import static java.lang.System.out;

public class HeightOfTree {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = buildTree();
        out.format("Height of tree is %s.", maxDepth(tree.root));
    }

    static BinaryTree<Integer> buildTree() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.root = new Node<>(1);
        tree.root.left = new Node<>(2);
        tree.root.right = new Node<>(3);
        tree.root.left.left = new Node<>(4);
        tree.root.left.right = new Node<>(5);
        tree.root.left.right.left = new Node<>(6);

        return tree;
    }

    static <T> int maxDepth(Node<T> node) {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth) return (lDepth + 1);
            else return (rDepth + 1);
        }
    }
}

class BinaryTree<T> {
    Node<T> root;
}

class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
    }
}