# Funciones de Prolog

- **consult (rutafichero)**: Carga un programa.
- **reconsult (rutafichero)**: Recarga un programa.
- **fail**:  Da siempre falso (no)
- write (dato) Escribe en pantalla el dato
- **tell**: (rutaficherosalida) Indica a write cual es el fichero de salida.
- **nl**: Produce un salto de línea.
- **atom (X)**: Indica si X es un átomo.
- **var (X)**: Indica si X es una variable.
- **integer (X)**: Indica si X es un enter.
- **trace**: Debug perron
- **findall/3**: This predicate is used to make a list of all solutions X, from the predicate P.
- **setoff/3**: Similar to findall/3, but it removes all of the duplicate outputs, and the returns the sorted answers.
- **bagof/3**: Similar to setoff/3, but duplicates are retained, and the answers may not be sorted.
- **random(L,H,X)**: Un numero aleatorio entre L y H.
- **between(L,H,X)**: Obtener todos los numeros que se encuentran entre L y H.
- **succ**

> El numero que va despues del `/` especifica cuantos argumentos toma la funcion.

## Implementación de corte

```text
% Caso base: el factorial de 0 es 1
factorial(0,1) = !.

% Caso recursivo: factorial de N es N * factorial de N - 1
factorial(N,F) :-
    N > 0,                      % Comprobar que N > 0
    N1 is N - 1m                % Se calcula N - 1
    factorial(N1, F1),          % LLamada recursiva
    F is N * F1.                % Calcular el factorial

```
