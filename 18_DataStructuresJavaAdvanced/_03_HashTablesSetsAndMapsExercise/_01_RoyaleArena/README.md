# Royale Arena Documentation

Overview:

The RoyaleArena class represents an arena in a card-based game where battles occur. It implements the IArena interface. It provides methods for managing and retrieving battlecards stored within the arena. The arena maintains battlecards in a Set and provides additional data structures for efficient retrieval based on different criteria such as card type and damage.

Methods:

* count(): Returns the number of battlecards in the arena.
* add(Battlecard card): Adds a battlecard to the arena.
* changeCardType(int id, CardType type): Changes the type of a battlecard given its ID.
* contains(Battlecard card): Checks if the arena contains a specific battlecard.
* findFirstLeastSwag(int n): Finds and returns the first N battlecards with the least "swag" (a measure of card value).
* getAllByNameAndSwag(): Returns an iterable of battlecards grouped by name, with each group containing the battlecard with the highest swag.
* getAllInSwagRange(double lo, double hi): Returns an iterable of battlecards within a specified swag range.
* getByCardType(CardType type): Returns an iterable of battlecards of a specific type, sorted by their natural order.
* getByCardTypeAndMaximumDamage(CardType type, double damage): Returns an iterable of battlecards of a specific type with damage less than or equal to a given value.
* getById(int id): Retrieves a battlecard by its ID.
* getByNameAndSwagRange(String name, double lo, double hi): Returns battlecards with a specific name and damage within a specified range, sorted by swag in descending order.
* getByNameOrderedBySwagDescending(String name): Returns battlecards with a specific name, sorted by swag in descending order.
* getByTypeAndDamageRangeOrderedByDamageThenById(CardType type, int lo, int hi): Returns battlecards of a specific type within a specified damage range, sorted by damage and then by ID.
* removeById(int id): Removes a battlecard from the arena by its ID.
* iterator(): Provides an iterator over the battlecards stored in the arena.
