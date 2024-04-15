/*************************************************
 File: Driver.java
 By: Edward McDonald
 Date: April 14th, 2024
 Compile: -
 Description: Driver for a user to transverse a binary tree
 *************************************************/

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("a. Insert element into the tree");
            System.out.println("b. Delete element from the tree");
            System.out.println("c. Search for an element in the tree");
            System.out.println("d. In-order traversal of the tree");
            System.out.println("e. Pre-order traversal of the tree");
            System.out.println("f. Post-order traversal of the tree");
            System.out.println("g. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    System.out.println("Enter the element to insert:");
                    int insertElement = scanner.nextInt();
                    bst.insert(insertElement);
                    System.out.println("Element inserted successfully.");
                    break;
                case "b":
                    System.out.println("Enter the element to delete:");
                    int deleteElement = scanner.nextInt();
                    bst.delete(deleteElement);
                    System.out.println("Element deleted successfully.");
                    break;
                case "c":
                    System.out.println("Enter the element to search:");
                    int searchElement = scanner.nextInt();
                    boolean found = bst.search(searchElement);
                    if (found)
                        System.out.println("Element found in the tree.");
                    else
                        System.out.println("Element not found in the tree.");
                    break;
                case "d":
                    System.out.println("In-order traversal:");
                    System.out.println(bst.inOrderTraversal());
                    break;
                case "e":
                    System.out.println("Pre-order traversal:");
                    System.out.println(bst.preOrderTraversal());
                    break;
                case "f":
                    System.out.println("Post-order traversal:");
                    System.out.println(bst.postOrderTraversal());
                    break;
                case "g":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid operation.");
            }
        }
    }
}