Binary Tree Documentation
Overview

A binary tree is a hierarchical data structure composed of nodes, each containing a key value and references to its left and right subtrees. This implementation provides essential operations for managing a binary tree structure and performing traversals.
Class: BinaryTree<E>

This class represents a binary tree and implements the basic operations for managing and traversing the tree.
Constructor

    BinaryTree(E key): Constructs a binary tree node with the specified key.

Methods

    E getKey(): Returns the key of the current node.
    BinaryTree<E> getLeft(): Returns the left subtree of the current node.
    BinaryTree<E> getRight(): Returns the right subtree of the current node.
    void setKey(E key): Sets the key of the current node.
    String asIndentedPreOrder(int indent): Returns a string representation of the tree in pre-order traversal with indentation.
    List<BinaryTree<E>> preOrder(): Returns the tree in pre-order traversal.
    List<BinaryTree<E>> inOrder(): Returns the tree in in-order traversal.
    List<BinaryTree<E>> postOrder(): Returns the tree in post-order traversal.
    void forEachInOrder(Consumer<E> consumer): Applies a Consumer<E> on each node traversed in in-order.
