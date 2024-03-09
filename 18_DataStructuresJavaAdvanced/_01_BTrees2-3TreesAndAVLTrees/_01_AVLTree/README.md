# AVL Tree Documentation

Overview:

An AVL (Adelson-Velsky and Landis) tree is a self-balancing binary search tree where the height difference between left and right subtrees of any node is limited to one. This ensures efficient operations like insertion, deletion, and search with logarithmic time complexity. AVL trees automatically adjust their structure through rotations to maintain balance, making them ideal for scenarios requiring fast data retrieval and storage. The AVL class represents a self-balancing binary search tree. It ensures that the tree remains balanced after insertions and deletions, maintaining a logarithmic height for efficient searching.

Methods:

* public Node&lt;T&gt; getRoot(): Returns the root node of the AVL tree.
* public boolean contains(T item): Determines whether the AVL tree contains the specified item. Returns true if the item is found, otherwise false.
* public void insert(T item): Inserts a new item into the AVL tree while maintaining balance. If the item already exists, it does not insert a duplicate.
* public void eachInOrder(Consumer&lt;T&gt; consumer): Performs an in-order traversal of the AVL tree and applies the specified action to each node's value. Accepts a Consumer functional interface to define the action to be performed.
* private void eachInOrder(Node&lt;T&gt; node, Consumer&lt;T&gt; action): Performs an in-order traversal of the AVL tree recursively. Accepts a node and an action to perform on each node's value.
* private Node&lt;T&gt; insert(Node&lt;T&gt; node, T item): Inserts a new item recursively into the AVL tree. Adjusts the tree structure to maintain balance after insertion. Returns the root node of the subtree after insertion.
* private Node&lt;T&gt; rotateRight(Node&lt;T&gt; x): Performs a right rotation on the given node. Adjusts the tree structure to maintain balance after rotation. Returns the new root node of the subtree after rotation.
* private Node&lt;T&gt; rotateLeft(Node&lt;T&gt; x): Performs a left rotation on the given node. Adjusts the tree structure to maintain balance after rotation. Returns the new root node of the subtree after rotation.
* private Node&lt;T&gt; balance(Node&lt;T&gt; node): Balances the AVL tree by performing rotations as necessary. Returns the root node of the balanced subtree.
* private Node&lt;T&gt; search(Node&lt;T&gt; node, T item): Searches for a specific item recursively within the AVL tree. Returns the node containing the item if found; otherwise, returns null.
* private void updateHeight(Node&lt;T&gt; node): Updates the height of a given node based on its children's heights.
* private int height(Node&lt;T&gt; node): Calculates the height of a given node in the AVL tree.
* private static <T extends Comparable&lt;T&gt;> int staticHeight(Node&lt;T&gt; node): Static method to calculate the height of a given node.
