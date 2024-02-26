# Tree Documentation

Overview:

The Tree<E> class provides a generic implementation of a tree data structure. It implements the Abstract Data Structure (ADS) AbstractTree<E> interface to manage hierarchical relationships between elements of type E. This documentation outlines the functionality and usage of the Tree<E> class.

Methods:

* Create Tree Method Signature: public Tree(E key, List<Tree<E>> children); Description: Constructs a tree with the specified key and children; Parameters: key: The key value of the root node. children: List of child trees for the root node;

* BFS Traversal: Method Signature: public List<E> orderBfs(); Description: Performs Breadth-First Search traversal on the tree and returns elements in level-wise order; Returns: A list containing elements traversed in BFS order;

* DFS Traversal; Method Signature: public List<E> orderDfs(); Description: Performs Depth-First Search traversal on the tree and returns elements in descendant before sibling order; Returns: A list containing elements traversed in DFS order;

* Add Child: Method Signature: public void addChild(E key, Tree<E> child): Description: Adds a child tree to the node with the specified key; Parameters: key: The key value of the node to which the child tree will be added. child: The child tree to be added;

* Remove Node: Method Signature: public List<E> removeNode(E key); Description: Removes the node with the specified key and all its descendants from the tree; Parameters: key: The key value of the node to be removed; Returns: A list containing elements removed from the tree;
 

  

  
