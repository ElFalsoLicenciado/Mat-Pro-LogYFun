(setq mi-lista '(1 2 3 4))

(defun recorrer (lista)
    (if (= (cdr lista) NIL)
        (car lista)
    )
    (recorrer (cdr lista))
)