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