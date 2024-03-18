# B-Trees, 2-3 Trees and AVL Trees - Lecture

* B-Trees -> ordered BST, of order b has between b and 2*b keys in a node and between b+1 and 2*b+1 child nodes; ordered increasingly;
* B-Trees -> dont need frequent balancing, good for db indexes, almost perfectly balanced;
* 2-3 Tree -> can contain null, 2-node with 1 key and 2 links(children) and 3-node with 2 keys and 3 links(children); left(smaller) and right(larger) values;
* 2-3 Tree -> grows from the bottom, nearly perfectly balanced, search/insert/delete complexity - c lg N;
* AVL Tree -> self-balancing binary search tree(where the height of two subtrees can differ by at most 1); search/insert/delete complexity - O(logn);
* AVL Tree -> height is measured by balance factor([-1,1]) and if it becomes [-2,2] the tree needs to rebalance(done from the bottom-up)((right-rotation) and (left rotation));
* AVL Tree -> after insert(based on value smaller/larger) we update heights and rebalance if needed; requires more rotation for balancing;
* AVL Tree -> single and double rotation; sometimes a single rotate is not enough for the balance of the tree; search/insert/delete complexity 1.44 lg N;
