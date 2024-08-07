# Tree Exercise Documentation

Overview:

The following documentation provides an overview of various problems related to trees. Each problem entails a specific task that requires understanding basic tree concepts and traversal algorithms such as Depth-First Search (DFS) and Breadth-First Search (BFS).

Methods:

* void setParent(Tree&lt;E&gt; parent); Description: Sets the parent node of the current tree node. Parameters: parent: The parent tree node to be set.
* void addChild(Tree&lt;E&gt; child); Description: Adds a child tree node to the current tree node. Parameters: child: The child tree node to be added.
* Tree&lt;E&gt; getParent(); Description: Retrieves the parent tree node of the current tree node. Returns: The parent tree node.
* E getKey(); Description: Retrieves the key value of the current tree node. Returns: The key value of the tree node.
* String getAsString(); Description: Returns a string representation of the tree. Returns: A string representing the tree structure.
* List&lt;E&gt; getLeafKeys(); Description: Retrieves the keys of all leaf nodes in the tree. Returns: A list containing the keys of leaf nodes.
* List&lt;E&gt; getMiddleKeys(); Description: Retrieves the keys of all middle nodes in the tree. Returns: A list containing the keys of middle nodes.
* Tree&lt;E&gt; getDeepestLeftmostNode(); Description: Finds and retrieves the deepest leftmost node in the tree. Returns: The deepest leftmost node.
* List&lt;E&gt; getLongestPath(); Description: Finds and retrieves the longest path in the tree. Returns: A list containing the keys of nodes along the longest path.
* List<List&lt;E&gt;> pathsWithGivenSum(int sum); Description: Finds all paths in the tree with a given sum of their nodes. Parameters: sum: The target sum of nodes in each path. Returns: A list of lists containing keys of nodes in paths with the given sum.
* List<Tree&lt;E&gt;> subTreesWithGivenSum(int sum); Description: Finds all subtrees in the tree with a given sum of their nodes. Parameters: sum: The target sum of nodes in each subtree. Returns: A list of subtrees with the given sum.
