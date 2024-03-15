HashTable Documentation

Overview:

A HashTable is a data structure that implements a hash table, allowing for efficient storage and retrieval of key-value pairs. It utilizes a hash function to map keys to indices in an array, providing fast access to elements based on their keys. Hash tables are commonly used in computer science due to their constant-time average-case complexity for basic operations such as insertion, deletion, and lookup. They are suitable for a wide range of applications where fast access to data based on keys is required, such as database indexing, caching, and symbol tables. A HashTable is a data structure that implements a hash table for storing key-value pairs. It uses a hash function to map keys to indices in an array, allowing for efficient insertion, deletion, and retrieval of elements based on their keys.

Methods:

* void add(K key, V value): Adds a key-value pair to the hash table.
* boolean addOrReplace(K key, V value): Adds a key-value pair to the hash table or replaces the value if the key already exists.
* V get(K key): Retrieves the value associated with the specified key from the hash table.
* KeyValue<K, V> find(K key): Finds and returns the key-value pair associated with the specified key from the hash table.
* boolean containsKey(K key): Checks if the hash table contains the specified key.
* boolean remove(K key): Removes the key-value pair associated with the specified key from the hash table.
* int size(): Returns the number of elements currently stored in the hash table.
* int capacity(): Returns the current capacity of the hash table.
* void clear(): Clears all elements from the hash table.
*c Iterable<K> keys(): Returns an iterable containing all keys stored in the hash table.
* Iterable<V> values(): Returns an iterable containing all values stored in the hash table.
* Iterator<KeyValue<K, V>> iterator(): Returns an iterator over the key-value pairs stored in the hash table.
