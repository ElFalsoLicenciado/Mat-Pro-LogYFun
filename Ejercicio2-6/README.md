# Eliza

Eliza simula una conversación humana básica mediante patrones de entrada y respuestas predefinidas.

## Estructura general del programa

1. Una interfaz de entrada principal.
2. Un conjunto de reglas para detectar cuándo terminar la conversación.
3. Plantillas que definan cómo responder a ciertos patrones de entrada.
4. Predicados auxiliares como `match/2`, `replace0/5`, y conocimiento del mundo (gustos, acciones, familia, etc.).

## Predicado principal


```perl
eliza :- 
	writeln('Hola, mi nombre es Eliza tu chatbot,'),
	writeln('por favor ingresa tu consulta,'),
	writeln('usar solo minusculas sin . al final:'),
	readln(Input),
	eliza(Input), !.
```

## Casos base para terminar

```perl
eliza(Input) :- Input == ['Adios'], writeln('Adios. espero poder verte ayudado'), !.
eliza(Input) :- Input == ['adios', '.'], writeln('Adios. espero poder verte ayudado.'), !.
eliza(Input) :- Input == ['Bye', '.'], writeln('Bye bye.'), !.
eliza(Input) :- Input == ['bye', '.'], writeln('Bye bye.'), !.
```

## Mecanismo de respuesta


```Perl
eliza(Input) :-
    template(Stim, Resp, IndStim),
    match(Stim, Input),
    replace0(IndStim, Input, 0, Resp, R),
    writeln(R),
    readln(Input1),
    eliza(Input1), !.
```

Este es el núcleo del chatbot. Para cada entrada:

1. Se busca una plantilla que coincida con `Input`.
2. Se reemplazan partes de la entrada dentro de la respuesta.
3. Se imprime la respuesta y se lee la siguiente entrada.

## Plantillas de dialogo

```Perl
template(InputPattern, ResponsePattern, IndexList).
```

Donde:

- `InputPattern` es un patrón que debe hacer **match** con lo que el usuario escribe.
- `ResponsePattern` es la respuesta generada, con variables (números) a reemplazar.
- `IndexList` indica qué posiciones del input se insertarán en la respuesta.
### Ejemplo


```perl
template([hola, s(_), como, estas, soy, s(_), '.'],
         [hola , 1, 'como estas tu yo soy', 0 , 'como esta tu ?'],
         [1, 5]).
```
