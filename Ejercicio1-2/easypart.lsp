; Ejercicios usando CARD y CDR en listas

; a) (1 2 3 4 5 6 7 8 9 10) -> (6 , 8, 10)

(cadr (cddddr '(1 2 3 4 5 6 7 8 9 10)))
(cadddr (cddddr '(1 2 3 4 5 6 7 8 9 10)))
(cadr (cddddr (cddddr '(1 2 3 4 5 6 7 8 9 10))))

; b) (1 2 (3 4) (A B C D)) -> (D, C, 4, 2 ,A)

(cadddr (cadddr '(1 2 (3 4) (A B C D))))
(caddr (cadddr '(1 2 (3 4) (A B C D))))
(cadr (caddr '(1 2 (3 4) (A B C D))))
(caaddr '(1 2 (3 4) (A B C D)))
(car (cadddr '(1 2 (3 4) (A B C D))))


; c) ((A B C) (R(T X) (Z W))) -> (W, Z, T, R, X, A)
(cadr (caddr (cadr  '((A B C) (R (T X) (Z W))))))
(caaddr (cadr  '((A B C) (R (T X) (Z W)))))


; d) ((((ab) (c d) (f y)))) -> (a b c d f y)

