# Hierarchy Documentation

Overview: 

The Hierarchy class implements the IHierarchy interface and represents a hierarchical structure with elements of type T. The Hierarchy class provides functionalities to manage hierarchical data structures efficiently, enabling operations like adding, removing, and traversing elements within the hierarchy. It utilizes the HierarchyNode class to represent nodes in the hierarchy.

Methods:

* public int getCount(): Returns the count of elements in the hierarchy.
* public void add(T element, T child): Adds a child element under the specified parent element.
* public void remove(T element): Removes the specified element from the hierarchy.
* public Iterable&lt;T&gt; getChildren(T element): Returns the children of the specified element.
* public T getParent(T element): Returns the parent of the specified element.
* public boolean contains(T element): Checks if the hierarchy contains the specified element.
* public Iterable&lt;T&gt; getCommonElements(IHierarchy&lt;T&gt; other): Returns the common elements between this hierarchy and another hierarchy.
* public Iterator&lt;T&gt; iterator(): Provides an iterator for traversing the hierarchy.
* private HierarchyNode&lt;T&gt; ensureExistsAndGet(T key): Ensures that the specified element exists in the hierarchy and retrieves its corresponding node.

