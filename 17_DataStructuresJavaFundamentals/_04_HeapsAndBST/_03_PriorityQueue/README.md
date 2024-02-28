# PriorityQueue Documentation

Overview:

The priority queue is a data structure that maintains a collection of elements, each associated with a priority. The essential characteristic of a priority queue is that the element with the highest (or lowest) priority can be efficiently retrieved or removed, allowing for efficient management of items based on their relative importance or urgency.  
The PriorityQueue class is an implementation of a priority queue. In this implementation, elements are required to implement the Comparable interface, allowing the queue to prioritize elements based on their natural order.

Methods:

* int size() - Returns the number of elements in the priority queue.

* void add(E element) - Adds the specified element to the priority queue.

* E peek() - Retrieves, but does not remove, the head of the priority queue.

* E poll() - Retrieves and removes the head of the priority queue.

* void heapifyUp(int index) - Restores the heap property by moving the element at the specified index upward.

* void heapifyDown(int index) - Restores the heap property by moving the element at the specified index downward.

* void heapifyDownProper(int index) - An alternative heapify down method that avoids unnecessary swaps.

* boolean isLess(int childIndex, int parentIndex) - Compares elements at two indices and returns true if the element at the child index is less than the element at the parent index.

* boolean isLessFirstAndSecond(int first, int second) - Compares elements at two indices and returns true if the element at the first index is less than the element at the second index.

* E getAt(int index) - Retrieves the element at the specified index.

* int getParentIndex(int index) - Returns the index of the parent element given the index of a child element.

* int getLeftChildIndex(int index) - Returns the index of the left child element given the index of a parent element.

* int getRightChildIndex(int index) - Returns the index of the right child element given the index of a parent element.

* E getLeftChild(int index) - Retrieves the left child element given the index of a parent element.

* E getRightChild(int index) - Retrieves the right child element given the index of a parent element.
