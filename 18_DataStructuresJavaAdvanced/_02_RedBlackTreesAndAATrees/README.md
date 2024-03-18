# Red-Black Trees and AA Trees - Lecture

- Red-Black Tree -> all leaves are black, root is black, no node has two red links connected, every path to descendant leaf contains same number of black nodes, red links lean left;
- Red-Black Tree -> rotations(left and right) are used to balance the tree(balance is measured with height/depth/size/etc); 
- Red-Black Tree -> Insert(based on 2-3 node sets) - locate node, create red node, add new node to the tree and balance; 
- Red-Black Tree -> flipping colors if needed and that should change the parent color to red unless its the root; each time the root swaps colors the height increases;
- Red-Black Tree -> search/insert/delete complexity - 2 log N;
- AA Tree -> level of every leaf is one, every left child has one less level than its parent, every right child has equal or less level than its parent;
- AA Tree -> simplifies red-black tree algorithms and adds levels to the concept;
- AA Tree -> right horizontal links are possible and left horizontal links are not allowed;
- AA Tree -> skew - is a single right rotation when we insert/delete and create a horizontal left;
- AA Tree -> split - is a single left rotation when there are two consecutive right horizontal links;
- AA Tree -> bottom- up structure where new nodes are always inserted at level 1;
