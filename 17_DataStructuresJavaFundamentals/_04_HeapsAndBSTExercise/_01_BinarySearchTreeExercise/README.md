# BinarySearchTree Documentation

Overview:
A Binary Search Tree (BST) is a hierarchical data structure where each node has at most two children: a left child and a right child. In a BST, elements are organized such that elements smaller than a node are on its left, and elements greater are on its right. This organization enables efficient searching, insertion, and deletion operations. It's widely used in computer science for its fast searching and sorting capabilities. The BinarySearchTree class represents a binary search tree data structure. It provides methods for inserting, searching, deleting, and traversing elements within the tree. The tree maintains elements in sorted order based on their natural ordering.

Methods:

* void eachInOrder(Consumer&lt;E&gt; consumer): Performs an in-order traversal of the tree, applying the provided consumer to each element.
* Node&lt;E&gt; getRoot(): Retrieves the root node of the tree.
* void insert(E element): Inserts a new element into the tree while maintaining its sorted order.
* boolean contains(E element): Checks if the tree contains a specified element.
* BinarySearchTree&lt;E&gt; search(E element): Searches for a specific element in the tree and returns a new tree containing the found node.
* List&lt;E&gt; range(E lower, E upper): Retrieves a list of elements within the specified range.
* void deleteMin(): Deletes the minimum element from the tree.
* void deleteMax(): Deletes the maximum element from the tree.
* int count(): Returns the total number of elements in the tree.
* int rank(E element): Returns the number of elements less than a specified element.
* E ceil(E element): Finds the smallest element greater than or equal to the specified element.
* E floor(E element): Finds the largest element smaller than or equal to the specified element.

Node Class:
* The Node class represents a node within the binary search tree.
* It encapsulates the value of the node, left and right child nodes, and the count of nodes in its subtree.
* The class provides methods to access the node's value, left and right child nodes, and the count of nodes.

