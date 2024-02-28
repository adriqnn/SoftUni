# Binary Tree Documentation

Overview:

A binary tree is a hierarchical data structure composed of nodes, each containing a key value and references to its left and right subtrees. This implementation provides essential operations for managing a binary tree structure and performing traversals. Class: BinaryTree<E> This class represents a binary tree and implements the basic operations for managing and traversing the tree.

Methods:

* E getKey(): Returns the key of the current node.
  
* BinaryTree&lt;E&gt; getLeft(): Returns the left subtree of the current node.
  
* BinaryTree&lt;E&gt; getRight(): Returns the right subtree of the current node.
  
* void setKey(E key): Sets the key of the current node.
  
* String asIndentedPreOrder(int indent): Returns a string representation of the tree in pre-order traversal with indentation.
  
* List<BinaryTree&lt;E&gt;> preOrder(): Returns the tree in pre-order traversal.
  
* List<BinaryTree&lt;E&gt;> inOrder(): Returns the tree in in-order traversal.
  
* List<BinaryTree&lt;E&gt;> postOrder(): Returns the tree in post-order traversal.
  
* void forEachInOrder(Consumer&lt;E&gt; consumer): Applies a Consumer<E> on each node traversed in in-order.
