# Two-Three Tree Documentation

Overview:

A 2-3 tree is a self-balancing search tree where each node can have either two or three children. It maintains balance by redistributing keys and nodes when necessary during insertion and deletion operations. With logarithmic time complexity for search, insertion, and deletion, 2-3 trees are efficient data structures for storing and managing sorted data. The TwoThreeTree class represents a 2-3 tree, a type of self-balancing search tree where nodes can have either two or three children. The TwoThreeTree class provides methods to insert keys into the tree and retrieve a string representation of the tree structure. It employs the TreeNode nested class to represent nodes within the tree, facilitating the organization and manipulation of key-value pairs within a balanced tree structure.

Methods:

* public void insert(K key): Inserts a key into the 2-3 tree.
* private TreeNode&lt;K&gt; insert(TreeNode&lt;K&gt; node, K key): Inserts a key into the specified node of the 2-3 tree.
* public String getAsString(): Returns a string representation of the 2-3 tree.
* private void recursivePrint(TreeNode&lt;K&gt; node, StringBuilder out): Recursively prints the nodes of the 2-3 tree.

