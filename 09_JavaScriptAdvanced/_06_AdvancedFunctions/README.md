# Advanced Functions - Lecture

- Execution Context -> this; depends on invocation(global(func()), object method(object.func()) and dom event(element.addEventListener())); using call, apply or bind;
- Arrow Function Context -> this retains the value of the enclosing lexical context;
- Explicit Binding -> used with call, bind or apply to bind a specific this to a function;
- Bind with call() -> function.call(context(this), item1, item2, item3 ...) the call uses values as arguments;
- Bind with apply() -> function.apply(context(this), [arr]) the apply uses an array as arguments;
- Bind with bind() -> function.bind(context(this)); the method creates a new function and sets its this to the given context; calling the new function calls the wrapped function;
- Functional Programming in JS -> first class functions, higher-order-functions and pure functions;
- First Class Functions -> function used as a value for other function, passed as an argument, returned by another function or assigned as value to a variable; describes functions as properties;
- Higher-Order Functions -> takes other functions as arguments or returns a function as result; describes functions that operate with functions or return functions as result;
- Predicates -> boolean based values used often in callback functions;
- Pure Functions -> closed execution and always returns the same result with the same given parameters; independent of the state of the system;
- Referential Transparency -> expression that can be replaced with its corresponding value without changing the program's behaviour;
- Closure -> scope of inner function includes the scope of outer function; inner function retains the variables being used from the outer function even after the parent function has returned result; provides state;
- IIFE ->  Immediately-Invoked Function Expressions; anonymous function expressions that are invoked immediately after declarations;
- Function Decoration -> partial application and currying;
- Partial Application -> sets function arguments without executing them; pass remaining arguments when result is needed; retains all fixed arguments and can be used multiple times;
- Currying -> supply arguments one at a time instead of at once, arguments can come from different sources and the execution might be delayed; used in function composition, memoization, to handle errors and others;
- Partial Application vs. Currying -> function with arbitrary number of arguments vs. nested unary functions; currying is not partial application but can be implemented using partial application;
