# Tail call optimizations #

Program for testing:
```
main = f 5 5;
f x n = if n == 1 then x else f (x * (n - 1)) (n - 1);
```