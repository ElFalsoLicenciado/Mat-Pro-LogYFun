(setq mi-lista '(1 2 3 4))

(defun recorrer (lista)
(format t "~A~% -> " (car lista)) ;Imprime la cabeza de la lista
    (if lista nil              ;Verifica que la lista no esta vacia
        (recorrer (cdr lista))    ;Llamado recursivo, le vamos a ir cortando la cabeza en cada ciclo.
        (format t ".")
    )
)