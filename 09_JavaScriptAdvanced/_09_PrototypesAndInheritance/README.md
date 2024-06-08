# Prototypes and Inheritance - Lecture

* Internal Object Properties -> every object has four properties(enumerable, configurable, writable and value); properties can be changed to false;
* Enumerable -> can access to all of them using a for...in loop; non-enumerable doesnt appear in iterations, wont appear in object.keys() and wont serialize with JSON.stringify;
* Configurable -> can modify the behaviour of the property; non-configurable object's properties cannot be changed anymore unless its to non-writable;
* Writable -> can modify the value ad update a property with assigning a new value to it; non-writable is one way and cannot be reverted; the non-writable is the reference and the object itself can be modified;
* Value -> the value of the object;
* Object Freeze and Seal -> freeze(prevents adding, removing or modifying properties of an object, making it immutable) and seal(prevents adding or removing properties of an object but allows modifications of existing properties);
* Inheritance -> single, multi-level, hierarchical and multiple(not good);
* Prototype -> object delegation; object template; prototype chain; reference to another object; __proto__; prototype property allows adding new properties to the object; prototype was used to simulate classes before they were added;
* Object Methods -> prototype, create, hasOwnProperty and other;
* Class Inheritance -> design pattern; creates copies; composition of objects is another option;
