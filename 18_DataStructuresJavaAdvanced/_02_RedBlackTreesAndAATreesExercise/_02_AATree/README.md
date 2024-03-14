AA Tree Documentation

Overveiw:

An AA tree, also known as an Arne Andersson tree, is a type of self-balancing binary search tree. It is a variation of the red-black tree that simplifies the balancing conditions while maintaining the same worst-case height. In an AA tree, each node has an additional level field compared to traditional binary search trees. The tree is balanced using skew and split operations, which ensure that the tree remains balanced after insertions and deletions. AA trees provide efficient logarithmic time complexity for insertion, deletion, and search operations in the worst case, making them suitable for various applications requiring dynamic sets or maps with sorted elements. An AA Tree is a type of self-balancing binary search tree that maintains the same worst-case height as a red-black tree but simplifies the balance conditions.

Methods:

* boolean isEmpty(): Checks if the tree is empty.
* void clear(): Clears the tree.
* void insert(T element): Inserts an element into the tree.
* int countNodes(): Counts the number of nodes in the tree.
* boolean search(T element): Searches for an element in the tree.
* void inOrder(Consumer<T> consumer): Traverses the tree in in-order and applies the consumer to each element.
* void preOrder(Consumer<T> consumer): Traverses the tree in pre-order and applies the consumer to each element.
* void postOrder(Consumer<T> consumer): Traverses the tree in post-order and applies the consumer to each element.
* Node<T> insert(Node<T> node, T element): Inserts an element into the subtree rooted at the given node.
* Node<T> skew(Node<T> node): Performs skew operation to maintain balance.
* Node<T> rotateRight(Node<T> node): Performs a right rotation.
* Node<T> split(Node<T> node): Performs split operation to maintain balance.
* Node<T> rotateLeft(Node<T> node): Performs a left rotation.
* int countNodes(Node<T> node): Counts the number of nodes in the subtree rooted at the given node.
* boolean search(Node<T> node, T element): Searches for an element in the subtree rooted at the given node.
* void inOrder(Node<T> node, Consumer<T> consumer): Traverses the subtree rooted at the given node in in-order.
* void preOrder(Node<T> node, Consumer<T> consumer): Traverses the subtree rooted at the given node in pre-order.
* void postOrder(Node<T> node, Consumer<T> consumer): Traverses the subtree rooted at the given node in post-order.
