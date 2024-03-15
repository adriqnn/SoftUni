PersonCollection Documentation

Overview:

The PersonCollectionImpl class implements the PersonCollection interface, providing functionality to manage a collection of Person objects. It offers methods to add, delete, and find Person objects based on various criteria such as email, name, age, and town. The class efficiently indexes Person objects for quick retrieval based on different attributes. This implementation ensures efficient retrieval of Person objects based on different attributes, utilizing various data structures and indexing techniques.

Methods:

* add(String email, String name, int age, String town): Adds a new Person object to the collection.
* delete(String email): Deletes the Person object with the specified email from the collection.
* getCount(): Returns the total number of Person objects in the collection.
* find(String email): Finds and returns the Person object with the specified email.
* findAll(String emailDomain): Finds and returns all Person objects with email domains matching the specified domain.
* findAll(String name, String town): Finds and returns all Person objects with the specified name and town.
* findAll(int startAge, int endAge): Finds and returns all Person objects within the specified age range.
* findAll(int startAge, int endAge, String town): Finds and returns all Person objects within the specified age range and town.

Inner Class:

NameTownKey: A private static nested class used as a composite key for indexing Person objects based on name and town.

Data Structures:

* peopleByEmail: Map storing Person objects indexed by email.
* peopleByEmailDomain: Map storing Person objects indexed by email domain.
* peopleByNameTownCombination: Map storing Person objects indexed by a combination of name and town.
* peopleByAge: TreeMap storing Person objects indexed by age.
* peopleByTownByAge: Map storing Person objects indexed by town and then by age.
