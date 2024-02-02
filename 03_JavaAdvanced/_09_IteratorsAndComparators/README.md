# Iterators and Comparators - Lecture

- Variable Arguments -> varargs(method with zero or multiple aruments)(String... values), only one in a method and always last;
- Collections -> collection hierarchy;
- Iterable<T> -> root interface, class that implements iterable cna be used ina  for loop, iterator(), forEach(consumer<? super t> action), spliterator()(used in parallel programming);
- Iterator<T> -> enables a cycle through a collection and is nested class for iterator;
- Comparator<E> -> provides custom comparison logic, compare(), multiple sorting, doesnt affect original class;
- Comparable<E> -> specifies how objects are getting compared, compareTo(), single sorting, affect original class;
