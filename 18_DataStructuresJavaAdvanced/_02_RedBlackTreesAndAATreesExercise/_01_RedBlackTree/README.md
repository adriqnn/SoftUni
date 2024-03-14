Red-Black Tree Documentation

Overview:

A Red-Black Tree is a type of self-balancing binary search tree that maintains balance through the use of color properties and rotations. It ensures that the tree remains approximately balanced, leading to efficient insertion, deletion, and search operations with a guaranteed worst-case time complexity of O(log n). In a Red-Black Tree, each node is marked with a color, typically red or black, and must adhere to specific rules regarding color and arrangement to maintain balance. These rules include ensuring that no two adjacent red nodes exist and that every path from the root to a leaf has the same number of black nodes, among others. Red-Black Trees are widely used in computer science and are the basis for many balanced tree data structures and algorithms. A Red-Black Tree is a type of self-balancing binary search tree where each node has an extra bit for denoting the color (red or black) and satisfies the following properties:

Methods:

* int size(): Returns the number of key-value pairs in the tree.
* boolean isEmpty(): Checks if the tree is empty.
* Value get(Key key): Retrieves the value associated with the given key.
* boolean contains(Key key): Checks if the tree contains the given key.
* void put(Key key, Value val): Inserts a new key-value pair into the tree.
* void deleteMin(): Deletes the node with the minimum key.
* void deleteMax(): Deletes the node with the maximum key.
* void delete(Key key): Deletes the node with the given key.
* int height(): Computes the height of the tree.
* Key min(): Returns the minimum key in the tree.
* Key max(): Returns the maximum key in the tree.
* Key floor(Key key): Returns the largest key less than or equal to the given key.
* Key ceiling(Key key): Returns the smallest key greater than or equal to the given key.
* Key select(int rank): Returns the key of the node at the given rank.
* int rank(Key key): Returns the rank of the given key.
* Iterable<Key> keys(): Returns an iterable object containing all keys in ascending order.
* Iterable<Key> keys(Key lo, Key hi): Returns an iterable object containing keys within the specified range.
* int size(Key lo, Key hi): Returns the number of keys within the specified range.
* boolean isRed(Node x): Checks if the given node is red.
* int size(Node x): Returns the number of nodes in the subtree rooted at the given node.
* Value get(Node x, Key key): Retrieves the value associated with the given key in the subtree rooted at the given node.
* Node put(Node h, Key key, Value val): Inserts a new key-value pair into the subtree rooted at the given node.
* Node deleteMin(Node h): Deletes the node with the minimum key in the subtree rooted at the given node.
* Node deleteMax(Node h): Deletes the node with the maximum key in the subtree rooted at the given node.
* Node delete(Node h, Key key): Deletes the node with the given key in the subtree rooted at the given node.
* Node rotateRight(Node h): Performs a right rotation at the given node.
* Node rotateLeft(Node h): Performs a left rotation at the given node.
* void flipColors(Node h): Flips the colors of the given node and its children.
* Node moveRedLeft(Node h): Moves a red link to the left in order to maintain balance.
* Node moveRedRight(Node h): Moves a red link to the right in order to maintain balance.
* Node balance(Node h): Restores the red-black tree invariant after an operation.
* int height(Node x): Computes the height of the subtree rooted at the given node.
* Node min(Node x): Returns the node with the minimum key in the subtree rooted at the given node.
* Node max(Node x): Returns the node with the maximum key in the subtree rooted at the given node.
* Node floor(Node x, Key key): Returns the node with the largest key less than or equal to the given key in the subtree rooted at the given node.
* Node ceiling(Node x, Key key): Returns the node with the smallest key greater than or equal to the given key in the subtree rooted at the given node.
* Key select(Node x, int rank): Returns the key of the node at the given rank in the subtree rooted at the given node.
* int rank(Node x, Key key): Returns the rank of the given key in the subtree rooted at the given node.
* boolean isBST(): Checks if the tree satisfies the binary search tree property.
* boolean isBST(Node x, Key min, Key max): Checks if the subtree rooted at the given node satisfies the binary search tree property within the specified range.
* boolean isSizeConsistent(): Checks if the subtree counts are consistent.
* boolean isSizeConsistent(Node x): Checks if the subtree counts are consistent for the subtree rooted at the given node.
* boolean isRankConsistent(): Checks if the ranks of keys are consistent.
* boolean is23(): Checks if the tree satisfies the 2-3 tree properties.
* boolean is23(Node x): Checks if the subtree rooted at the given node satisfies the 2-3 tree properties.
* boolean isBalanced(): Checks if the tree is balanced.
* boolean isBalanced(Node x, int black): Checks if the subtree rooted at the given node has the same number of black links on every path from the root to a leaf.
