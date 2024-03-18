# HashTables, Sets and Maps - Lecture

* Hash Table -> array that holds sets of key/value pairs mapped to position in a table(hashing), based on hashing and collision resolutions;
* Hash Table -> performance is amortized O(1) complexity;
* Hashing Functions -> Perfect Hashing function, Consistent(equal keys must produce same hash value), Efficient(fast to hash) and Uniform(good key distribution);
* Modular Hashing -> uses modular division to produce a hash value for the object, also hash values are always integers;
* Collisions -> when different keys have the same hash value which requires collisions resolution strategy; types - chaining in a list, open addressing, cuckoo hashing & other;
* Collisions(Chaining) -> objects with the same hash are chained into a linked list at the hash value;
* Collisions(Open Addressing) -> in case of collision there is an algorithm that gives a new slot in the table with linear probing;
* Sets and Bags -> ADT - Set(keeps elements with no duplicates) and Bag(keeps elements with duplicates);
* UnionWith -> contains all elements from 2 sets that are unique;
* IntersectWith -> contains elements from 2 sets that exist in both sets;
* ExceptWith -> contains elements from 1 set that are unique and are not in the second set;
* SymmerticExceptWith -> contains only unique elements from 2 sets;
* Comparing Keys -> implementing equals() and hashCode() and Comparable<T>;
* Map -> ADT(associative array) -> HashMap, LinkedMap and TreeMap;
