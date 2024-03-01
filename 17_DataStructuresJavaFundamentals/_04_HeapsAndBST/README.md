# Heaps and Binary Search Tree - Lecture

* Binary Tree -> ADS, each node has at most 2 children(left and right), the parent is called source, the most widespread form;
* Types of Binary Trees -> full(each node has 0 or 2 children), complete(nodes are filled top to bottom and left to right), perfect(combines complete and full)(leafs are at same level and nodes have 2 children);
* Binary Tree Traversal:Pre-order -> root - left - right;
* Binary Tree Traversal:In-order -> left - root - right;
* Binary Tree Traversal:Post-order -> left - right - root;
* Heap -> tree-based data structure that is stored in an array; Min Heap -> parent <= children; Max Heap -> parent >= children;
* Binary Heap -> represents complete binary tree, from left to right; parent(i) = (i-1)/2; left(i) = 2*i+1; right(i) = 2*i+2; insert; heapify;
* Priority Queue -> ADS, queue or stack, high priority > low priority; elements with equal priority in order of input;
* Priority Queue -> high priority elements go to the front of the queue and low priority goes to the back of the queue, in java priority is set with Comparable&lt;E&gt;;
* Binary Search Tree -> ordered in such that smaller elements are on left and greater are on the right of the root;
* Balanced Binary Search Tree -> height log(n) and have equal number of nodes in its subtrees;
