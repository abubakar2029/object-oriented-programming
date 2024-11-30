
# Generics in Java

## Generic Type Invocation
To reference the generic `Box` class from within your code, you must perform a **generic type invocation**.  
A generic type invocation is similar to an ordinary method invocation, but instead of passing an argument to a method, you pass a **type argument** — `Integer` in this case.

---

## Upper Bound Wildcard
An **upper bound** in generics restricts the type to a specific class or its subclasses.  
It's declared using `extends`.

---

## Generics Key Points
- **Bounded Generics**: Allow you to restrict types.  
  Example: `T extends Number` ensures only `Number` subclasses are allowed.
- **Safe Method Access**: With bounds, methods defined in the bound class or interface can be safely called.
- **Multiple Bounds**: Ensure that `T` satisfies all listed constraints.  
  Example: `<T extends A & B & C>`.

---
