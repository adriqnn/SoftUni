# MinHeap Class Documentation

Overview:

A MinHeap is a type of binary heap data structure where the root node always holds the smallest element compared to its children. This structure enables efficient retrieval of the minimum element and facilitates operations like insertion, deletion, and retrieval with logarithmic time complexity. The MinHeap is widely used in various algorithms, such as Dijkstra's algorithm and heap sort, due to its ability to maintain the smallest element at the root, making it a fundamental tool in computer science for optimizing certain tasks. The MinHeap class represents a minimum binary heap data structure. It maintains a collection of elements where each element is smaller than or equal to its children, satisfying the heap property. The MinHeap class utilizes a list to store elements and implements the Heap interface, which provides methods for interacting with the heap. It is designed to efficiently handle operations such as insertion, retrieval, and modification of elements while maintaining the minimum heap property.

Methods: 

* int size(): Returns the number of elements in the heap.
* void add(E element): Inserts a new element into the heap and ensures the heap property is maintained.
* E peek(): Retrieves the minimum element from the heap without removing it.
* E poll(): Retrieves and removes the minimum element from the heap, while maintaining the heap property.
* void decrease(E element): Decreases the value of a specified element in the heap and adjusts the heap to maintain its property.
* void heapifyUp(int index): Moves the element at the specified index up the heap to maintain the heap property.
* void heapifyDown(): Moves the element at the root of the heap down the heap to maintain the heap property.
* boolean isLess(int firstIndex, int secondIndex): Compares two elements in the heap to determine if the first element is less than the second.
* void ensureNonEmpty(): Ensures that the heap is not empty before performing operations that require elements.

