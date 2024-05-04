# Encapsulation - Lecture

- Hiding Implementation -> validation, data binding, private fields, public(accessors(getters) and mutators(setters)), this(current object(instance)), this can invoke methods and contructors of the class;
- Access Modifiers -> private, protected, default and public;
- Private Access Modifies -> private(classes and interfaces cannot be private)(data can only be accessed within declared class);
- Protected Access Modifier -> protected(classes and interfaces cannot be protected), grants access to sub-classes, non-related classes cannot access;
- Default Access Modifier -> not explicitly declared, package private(available only for classes in the same package);
- Public Access Modifier -> any class have access;
- Validation -> in setters, constructors use private setters, valid state of the object;
- Mutable and Immutable Objects -> content can be altered and content cannot be altered, can try and turn to unmodifiable objects in so that the getters do not turn into setters;
- Keyword Final -> final class cant be extended, final method cannot be overriden, final variable cannot be changed;
