;(setq edad '(10))


; A la hora de mandar la edad, mandarlo como lista: '10
(defun age-cinema (edad)
    (if (integerp edad)
        (case (> edad 0)
            (normal-clause)
            (otherwise-clause))
        (format t "No es un entero")
    )
)