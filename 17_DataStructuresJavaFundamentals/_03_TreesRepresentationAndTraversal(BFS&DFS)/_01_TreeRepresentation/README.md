# Tree Documentation

Overview:

The Tree&lt;E&gt; class provides a generic implementation of a tree data structure. It implements the Abstract Data Structure (ADS) AbstractTree&lt;E&gt; interface to manage hierarchical relationships between elements of type E. This documentation outlines the functionality and usage of the Tree&lt;E&gt; class.

Methods:

* Create Tree: Method Signature: public Tree(E key, List<Tree&lt;E&gt;> children); Description: Constructs a tree with the specified key and children; Parameters: key: The key value of the root node. children: List of child trees for the root node;

* BFS Traversal: Method Signature: public List&lt;E&gt; orderBfs(); Description: Performs Breadth-First Search traversal on the tree and returns elements in level-wise order; Returns: A list containing elements traversed in BFS order;

* DFS Traversal: Method Signature: public List&lt;E&gt; orderDfs(); Description: Performs Depth-First Search traversal on the tree and returns elements in descendant before sibling order; Returns: A list containing elements traversed in DFS order;

* Add Child: Method Signature: public void addChild(E key, Tree&lt;E&gt; child): Description: Adds a child tree to the node with the specified key; Parameters: key: The key value of the node to which the child tree will be added. child: The child tree to be added;

* Remove Node: Method Signature: public List&lt;E&gt; removeNode(E key); Description: Removes the node with the specified key and all its descendants from the tree; Parameters: key: The key value of the node to be removed; Returns: A list containing elements removed from the tree;

* Swap Nodes: Method Signature: public List&lt;E&gt; swapNodes(E key1, E key2); Description: Swaps two nodes along with their descendants in the tree; Parameters: key1: The key value of the first node to be swapped. key2: The key value of the second node to be swapped;Returns: A list containing elements affected by the node swap operation;
