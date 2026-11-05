# Operaciones basicas en listas

## Concatenar una lista

```prolog
concatenar([], L, L). % Si la primera lista esta vacia, entregar L
concatenar([H|T], L, [H|R]) :- concatenar(T,L,R). 
% Si existe la lista H, se entrega R.
```

1. ```prolog ?- concatenar([1,2], [3,4], R).```
    **H**ead: 1 **T**ail: [2] **L**: [3,4]

2. ```prolog concatenar([2], [3,4], R1)```
    **H**ead: 2 **T**ail: [] **L**: [3,4]

3. ```prolog concatenar([], [3,4], R2)```
    Como sabemos que si: La primera lista esta vacia, el resultado es la segunda lista.

```prolog concatenar([], [3,4], [3,4])```

> El paso final es cuando nos quedamos con la primera lista vacia.

## Tamaño de una lista

```prolog
tamano([], 0). % Si la lista esta vacia, entonces retornar 0.
tamano([_ | T], N) :- tamano(T, N1), N is N1 + 1. % Se usa _ que es una variable anonima.
```
