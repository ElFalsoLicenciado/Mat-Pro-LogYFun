# Condicionales en LISP

## Explicación de condicionales

### if

```commonlisp
(if (<condicion>)
      (<acciones-si-verdadero>)
      (<acciones-si-falso>))
```

### when (emulacion)

```commonlisp
;; when: ejecuta el cuerpo SOLO si la condición es verdadera
(if (>= edad 18)
      (format t "Puede votar."))
```

### unless (emulacion)

```commonlisp
;; unless: ejecuta el cuerpo SOLO si la condición es FALSA
(if (not (eq estatus "activo"))
      (format t t "Cuenta bloqueada: no se procesa."))
```

### switch

```commonlisp
(switch 'rol
   (case admin (format t "Acceso total"))
   (case editor (format t "Puede publicar"))
   (case lector (format t "Solo lectura"))
   (default (format t "Rol desconocido")))
```

## **Fecha**: 09/17/26

## **Descripción**

Resolver 10 ejercicios de validación en CLISP.

### Ejercicio 1 — if / else: edad para cine

#### Objetivo

Usar un if con else (y un if anidado) para validar un entero.

#### Enunciado

Escribe `(defun validar-edad-cine (edad))`

#### Reglas

1. Si *edad* no es un entero → **error** `"La edad debe ser un entero"`.
2. Si *edad* < 0 → **error** `"Edad negativa"`.
3. Si *edad* > 120 → **error** `"Edad no realista"`.
4. Si *edad* < 13 → **ok, clasificación** `"AA (infantil)"`.
5. Si *edad* < 18 → **ok, clasificación** `"B (adolescentes)"`.
6. En cualquier otro caso → **ok, clasificación** `"B15/C (adultos)"`.

> Pistas: `integerp, <, >, >=`
