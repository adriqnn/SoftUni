<# RedBlackTree Documentation

Overview:

A Red-Black Tree is a type of self-balancing binary search tree that maintains balance through the use of color properties and rotations. It ensures that the tree remains approximately balanced, leading to efficient insertion, deletion, and search operations with a guaranteed worst-case time complexity of O(log n). In a Red-Black Tree, each node is marked with a color, typically red or black, and must adhere to specific rules regarding color and arrangement to maintain balance. These rules include ensuring that no two adjacent red nodes exist and that every path from the root to a leaf has the same number of black nodes, among others. Red-Black Trees are widely used in computer science and are the basis for many balanced tree data structures and algorithms. The RedBlackTree class implements a red-black tree, a type of self-balancing binary search tree. It ensures logarithmic time complexity for basic operations like insertion, deletion, and search.

Methods:

* void insert(T value): Inserts a value into the red-black tree while maintaining the properties of a red-black tree.
* boolean contains(T value): Checks if the red-black tree contains a specific value.
* RedBlackTree&lt;T&gt; search(T item): Searches for a specific item in the red-black tree and returns a new red-black tree containing only that item and its descendants.
* void eachInOrder(Consumer&lt;T&gt; consumer): Performs an in-order traversal of the red-black tree and applies the given consumer action to each node's value.
* int getNodesCount(): Retrieves the total number of nodes in the red-black tree.
* Node&lt;T&gt; insert(Node&lt;T&gt; node, T value): Recursive method to insert a value into the red-black tree while preserving the red-black tree properties.
* Node&lt;T&gt; flipColors(Node&lt;T&gt; node): Performs color flipping to balance the red-black tree.
* Node&lt;T&gt; rotateRight(Node&lt;T&gt; node): Performs a right rotation to balance the red-black tree.
* Node&lt;T&gt; rotateLeft(Node&lt;T&gt; node): Performs a left rotation to balance the red-black tree.
* boolean isRed(Node&lt;T&gt; node): Checks if a node is red.
* Node&lt;T&gt; findElement(T item): Searches for a specific item in the red-black tree and returns the node containing it.
* int getNodesCount(Node&lt;T&gt; node): Recursive method to count the number of nodes in the red-black tree.
