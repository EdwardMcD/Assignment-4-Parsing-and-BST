/*************************************************
 File: README.md
 By: Edward McDonald
 Date: April 14th, 2024
 Compile: -
 Description: Description of Assignment 4
 *************************************************/

# Assignment-4 Parsing and BST
Assignment – 4 [ 100 Points ] CSC-413-02 Spring 2024 San Francisco State University Computer Science Department

Hello, this file is intended to be a roadmap in navigating and executing my submission for Assignment 4.
Github repo: https://github.com/EdwardMcD/Assignment-4-Parsing-and-BST.git


Directories:

│   pom.xml
│   ReadMe.txt
│
├───.idea
│       .gitignore
│       .name
│       compiler.xml
│       jarRepositories.xml
│       misc.xml
│       workspace.xml
│
├───src
│   ├───main
│   │   ├───java
│   │   │       BinarySearchTree.java
│   │   │       Driver.java
│   │   │       Node.java
│   │   │
│   │   └───resources
│   └───test
│       └───java
│               BinarySearchTreeTest.java
│
└───target
    ├───classes
    │       BinarySearchTree.class
    │       Driver.class
    │       Node.class
    │
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
            BinarySearchTreeTest.class

This is a smaller project, only using three classes (and an additional JUnit test class). The classes can be found in this directory:
D:\SFSU Spring 2024\Software Engineering\Assignment 4\src\main\java
And the JUnit tests can be found in this directory:
D:\SFSU Spring 2024\Software Engineering\Assignment 4\src\test\java

The classes are as follows:
BinarySearchTree.java
Driver.java
Node.java

BinarySearchTree.java is a class that holds all the methods and logic for transversing the binary tree. They are as follows:
	insert()
	delete()
	search()
	inOrderTransversal()
	preOrderTransversal()
	postOrderTransversal()

Driver.java is a class that handles the user interaction with the binary tree. When you run the program, you will be met with this message:
	Choose an operation:
	a. Insert element into the tree
	b. Delete element from the tree
	c. Search for an element in the tree
	d. In-order traversal of the tree
	e. Pre-order traversal of the tree
	f. Post-order traversal of the tree
	g. Exit
The user will then be able to transverse through the binary tree, as well as insert an element or delete an element by entering in the corresponding letter. They are also able to exit the program by entering g.

Node.java is a short class that outlines the structure of a node.
