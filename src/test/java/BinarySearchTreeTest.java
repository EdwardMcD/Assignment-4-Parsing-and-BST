/*************************************************
 File: BinarySearchTreeTest.java
 By: Edward McDonald
 Date: April 14th, 2024
 Compile: -
 Description: JUnit testing for assignment 4
 *************************************************/

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void testInsert() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // In-order traversal after insertion should be sorted
        assertEquals("In-order traversal after insertion is incorrect", "20 30 40 50 60 70 80 ", bst.inOrderTraversal());
    }

    @Test
    public void testDelete() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Delete leaf node
        bst.delete(20);
        assertEquals("In-order traversal after deleting leaf node is incorrect", "30 40 50 60 70 80 ", bst.inOrderTraversal());

        // Delete node with one child
        bst.delete(30);
        assertEquals("In-order traversal after deleting node with one child is incorrect", "40 50 60 70 80 ", bst.inOrderTraversal());

        // Delete node with two children
        bst.delete(50);
        assertEquals("In-order traversal after deleting node with two children is incorrect", "40 60 70 80 ", bst.inOrderTraversal());
    }

    @Test
    public void testSearch() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        assertTrue("Search for existing element returns false", bst.search(30));
        assertFalse("Search for non-existing element returns true", bst.search(90));
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        assertEquals("In-order traversal is incorrect", "20 30 40 50 60 70 80 ", bst.inOrderTraversal());
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        assertEquals("Pre-order traversal is incorrect", "50 30 20 40 70 60 80 ", bst.preOrderTraversal());
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        assertEquals("Post-order traversal is incorrect", "20 40 30 60 80 70 50 ", bst.postOrderTraversal());
    }
}