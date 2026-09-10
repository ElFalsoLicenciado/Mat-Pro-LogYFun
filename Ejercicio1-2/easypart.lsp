; Ejercicios usando CARD y CDR en listas

; a) (1 2 3 4 5 6 7 8 9 10) -> (6 , 8, 10)

;6
(cadr (cddddr '(1 2 3 4 5 6 7 8 9 10)))
;8
(cadddr (cddddr '(1 2 3 4 5 6 7 8 9 10)))
;9
(cadr (cddddr (cddddr '(1 2 3 4 5 6 7 8 9 10))))

; b) (1 2 (3 4) (A B C D)) -> (D, C, 4, 2 ,A)

;D
(cadddr (cadddr '(1 2 (3 4) (A B C D))))
;C
(caddr (cadddr '(1 2 (3 4) (A B C D))))
;4
(cadr (caddr '(1 2 (3 4) (A B C D))))
;2
(caaddr '(1 2 (3 4) (A B C D)))
;A
(car (cadddr '(1 2 (3 4) (A B C D))))


; c) ((A B C) (R(T X) (Z W))) -> (W, Z, T, R, X, A)

;W
(cadr (caddr (cadr  '((A B C) (R (T X) (Z W))))))
;Z
(caaddr (cadr  '((A B C) (R (T X) (Z W)))))
;T
(caadr (cadr  '((A B C) (R (T X) (Z W)))))
;R
(car (cadr  '((A B C) (R (T X) (Z W)))))
;X
(cadadr (cadr  '((A B C) (R (T X) (Z W)))))
;A
(caar  '((A B C) (R (T X) (Z W))))

; d) ((((a b) (c d) (f y)))) -> (a b c d f y)

;A
(caaaar '((((a b) (c d) (f y)))))
;B
(caaaar '((((a b) (c d) (f y)))))
;C
(car (cadaar '((((a b) (c d) (f y))))))
;D
(cadr (cadaar '((((a b) (c d) (f y))))))
;F
(caar (cddaar '((((a b) (c d) (f y))))))
;Y
(cadar (cddaar '((((a b) (c d) (f y))))))