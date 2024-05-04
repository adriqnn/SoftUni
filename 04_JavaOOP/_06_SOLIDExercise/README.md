# SOLID - Exercise

- Single Responsibility Principle (SRP):  -> A class should have only one reason to change/one responsibility;
- Open/Closed Principle (OCP): -> Software entities should be open for extension but closed for modification(existing code);
- Liskov Substitution Principle (LSP): -> Subtypes must be substitutable for their base types without altering the correctness of the program;
- Interface Segregation Principle (ISP): -> Clients should not be forced to depend on interfaces they do not use;
- Dependency Inversion Principle (DIP): -> High-level modules should not depend on low-level modules. Both should depend on abstractions;

- *Reusability -> modularity, loose coupling, high cohesion
- *DIP Constructor Injection -> pros: self-documenting, works well, valid state vs. cons: many parameters, some method don't need all;
- *DIP Setter Injection -> pros: can change anytime, flexible vs. cons: invalid state sometimes, less intuitive;
