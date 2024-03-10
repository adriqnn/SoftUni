# AVL Tree Documentation

Overview:

An AVL (Adelson-Velsky and Landis) tree is a self-balancing binary search tree where the height difference between left and right subtrees of any node is limited to one. This ensures efficient operations like insertion, deletion, and search with logarithmic time complexity. AVL trees automatically adjust their structure through rotations to maintain balance, making them ideal for scenarios requiring fast data retrieval and storage. The AVL class represents a self-balancing binary search tree (AVL tree) in Java. It ensures that the heights of the two child subtrees of any node differ by at most one, allowing for efficient search, insertion, and deletion operations.

Methods:

* Node&lt;T&gt; getRoot(): Returns the root node of the AVL tree.
* int height(): Calculates and returns the height of the AVL tree.
* boolean contains(T item): Checks if the AVL tree contains a specific item.
* void insert(T item): Inserts a new item into the AVL tree while maintaining balance.
* void eachInOrder(Consumer&lt;T&gt; consumer): Performs an in-order traversal of the AVL tree and applies the specified action to each element.
* void delete(T item): Deletes a specified item from the AVL tree while maintaining balance.
* Node&lt;T&gt; delete(Node&lt;T&gt; node, T item): Helper method to delete a node from the AVL tree.
* T getMinT(Node&lt;T&gt; node): Retrieves the minimum element from a subtree.
* Node&lt;T&gt; deleteMin(Node&lt;T&gt; node): Deletes the node with the minimum value from the AVL tree.
* void deleteMin(): Deletes the node with the minimum value from the AVL tree.
* void deleteMax(): Deletes the node with the maximum value from the AVL tree.
* Node&lt;T&gt; deleteMax(Node&lt;T&gt; node): Deletes the node with the maximum value from a subtree.
* void eachInOrder(Node&lt;T&gt; node, Consumer&lt;T&gt; action): Helper method for in-order traversal.
* Node&lt;T&gt; insert(Node&lt;T&gt; node, T item): Helper method to insert a node into the AVL tree.
* Node&lt;T&gt; getMin(Node&lt;T&gt; node): Retrieves the node with the minimum value from a subtree.
* Node&lt;T&gt; rotateLeft(Node&lt;T&gt; node): Performs a left rotation on the AVL tree.
* Node&lt;T&gt; rotateRight(Node&lt;T&gt; node): Performs a right rotation on the AVL tree.
* Node&lt;T&gt; balance(Node&lt;T&gt; node): Balances the AVL tree after insertion or deletion.
* Node&lt;T&gt; search(Node&lt;T&gt; node, T item): Helper method to search for an item in the AVL tree.
* int balanceFactor(Node&lt;T&gt; node): Calculates the balance factor of a node.
* int height(Node&lt;T&gt; node): Calculates the height of a node.
* void updateHeight(Node&lt;T&gt; node): Updates the height of a node after insertion or deletion.
