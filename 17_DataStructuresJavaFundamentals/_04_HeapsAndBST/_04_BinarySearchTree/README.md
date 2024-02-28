# BinarySearchTree Class Documentation

Overview:

A binary search tree (BST) is a data structure that organizes elements in a hierarchical tree structure. Each node in the tree has at most two children, referred to as the left child and the right child. The BST maintains a specific order property: for every node, all elements in the left subtree are less than the node's value, and all elements in the right subtree are greater than the node's value. This ordering property enables efficient search, insertion, and deletion operations, typically with time complexity proportional to the height of the tree, making BSTs a fundamental tool in computer science for efficient data storage and retrieval. The BinarySearchTree class represents a binary search tree data structure. It implements the AbstractBinarySearchTree interface and is parameterized with a type E that extends Comparable<E>.

Methods:

* insert(E element): Inserts a new element into the binary search tree while maintaining the order property of the tree.

* contains(E element): Checks whether the specified element exists in the binary search tree.

* search(E element): Searches for the specified element in the binary search tree and returns a new tree containing only the found element (if present).

* getRoot(): Returns the root node of the binary search tree.

* getLeft(): Returns the left child node of the binary search tree.

* getRight(): Returns the right child node of the binary search tree.

* getValue(): Returns the value stored in the root node of the binary search tree.

* copy(Node<E> node): Copies the structure of the specified node and its descendants to the current binary search tree.

* isLess(E first, E second): Compares two elements and returns true if the first element is less than the second.

* isGreater(E first, E second): Compares two elements and returns true if the first element is greater than the second.

* areEqual(E first, E second): Compares two elements and returns true if they are equal.
