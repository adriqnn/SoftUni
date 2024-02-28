# MaxHeap Documentation

Overview:

he heap is typically implemented using an array-based representation where the elements are stored in level order. Max heap operations include adding elements, removing the maximum element, and heapifying to maintain the heap property. Max heaps are utilized in various algorithms like heap sort, priority queue implementations, and graph algorithms such as Dijkstra's algorithm. Description: The MaxHeap<E> class implements a max heap data structure using a generic type E that extends the Comparable interface. It provides methods for adding elements, peeking at the maximum element, and maintaining the heap property by heapifying elements upwards.

Methods:

* public int size(): Returns the number of elements in the max heap.
  
* public void add(E element): Adds an element to the max heap and adjusts the heap to maintain the max heap property.
  
* private void heapifyUp(int index): Adjusts the heap by moving the element at the given index upwards until the heap property is satisfied.
  
* private boolean isLess(int childIndex, int parentIndex): Checks if the element at the child index is less than the element at the parent index.
  
* private E getAt(int index): Retrieves the element at the specified index.
  
* private int getParentIndex(int index): Calculates the index of the parent node for a given child index.
  
* public E peek(): Returns the maximum element (root) of the max heap without removing it. Throws an IllegalStateException if the heap is empty.
