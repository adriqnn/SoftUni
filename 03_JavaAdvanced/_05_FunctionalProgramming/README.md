# Functional Programming - Lecture

- Lambda Expressions -> unnamed function, has (parameters) -> {body}, implicit and explicit, zero or more parameters () -> {...};
- Functions -> Function<Integer, Integer> func = x -> x * x(input, output, name, lambda expression), .apply()(calls the function;
- Consumer -> Consumer<T> (void), .accept()(calls the consumer);
- Supplier -> Supplier<T> (no parameters), .get()(calls the supplier);
- Predicate -> Predicate<T> (evaluates a condition - boolean), .test()(calls the predicate);
- Bi Functions -> functions with more parameters, BiFunction<T, U, R> like the other functions, .apply()(calls the function);
- *can pass functions to methods in the parameters as method(int number, Function<Integer, Integer> function){};
