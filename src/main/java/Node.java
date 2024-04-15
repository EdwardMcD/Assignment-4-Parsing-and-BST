/*************************************************
 File: Node.java
 By: Edward McDonald
 Date: April 14th, 2024
 Compile: -
 Description: Node class for assignment 4
 *************************************************/

public class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}