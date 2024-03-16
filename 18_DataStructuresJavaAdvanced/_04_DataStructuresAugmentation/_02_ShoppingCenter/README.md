# ShoppingCentre Documentation

Overview:

The ShoppingCentre class represents a shopping center that manages various products. It provides methods to add, delete, and find products based on different criteria such as name, producer, and price range.

Methods:

* addProduct(String name, double price, String producer): Adds a product to the shopping center with the given name, price, and producer. Returns a message indicating the success of the operation.
* delete(String producer): Deletes all products associated with the given producer. Returns a message indicating the number of products deleted.
* delete(String name, String producer): Deletes products with the given name and producer combination. Returns a message indicating the number of products deleted.
* findProductsByName(String name): Finds and returns a string representation of products with the given name.
* findProductsByProducer(String producer): Finds and returns a string representation of products produced by the given producer.
* findProductsByPriceRange(double startPrice, double endPrice): Finds and returns a string representation of products within the specified price range.
