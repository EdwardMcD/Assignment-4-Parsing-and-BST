/*************************************************
 File: BinarySearchTree.java
 By: Edward McDonald
 Date: April 14th, 2024
 Compile: -
 Description: Methods for transversing a binary tree
 *************************************************/

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insertion of elements into the tree
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Deletion of elements from the tree
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the smallest in the right subtre
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Search for an element in the tree
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    // In-order traversal of the tree
    public String inOrderTraversal() {
        StringBuilder result = new StringBuilder();
        inOrderTraversalRec(root, result);
        return result.toString();
    }

    private void inOrderTraversalRec(Node root, StringBuilder result) {
        if (root != null) {
            inOrderTraversalRec(root.left, result);
            result.append(root.key).append(" ");
            inOrderTraversalRec(root.right, result);
        }
    }

    // Pre-order traversal of the tree
    public String preOrderTraversal() {
        StringBuilder result = new StringBuilder();
        preOrderTraversalRec(root, result);
        return result.toString();
    }

    private void preOrderTraversalRec(Node root, StringBuilder result) {
        if (root != null) {
            result.append(root.key).append(" ");
            preOrderTraversalRec(root.left, result);
            preOrderTraversalRec(root.right, result);
        }
    }

    // Post-order traversal of the tree
    public String postOrderTraversal() {
        StringBuilder result = new StringBuilder();
        postOrderTraversalRec(root, result);
        return result.toString();
    }

    private void postOrderTraversalRec(Node root, StringBuilder result) {
        if (root != null) {
            postOrderTraversalRec(root.left, result);
            postOrderTraversalRec(root.right, result);
            result.append(root.key).append(" ");
        }
    }
}