; 1
( defun ar-cuad () 
    (format t "Dame el lado de tu cuadrado: ")
    (setq l (read))
    (format t "El area de tu cuadrado es: ~A~%" ( * l l ))
)

; 2
(defun ar-rect ()
    (format t "Dame")
    (* b h)
)

; 3
(defun ar-tria ( b h )
    (/ (* b h ) 2)
)

; 4
(defun ar-circ ( r )
    (* (* r r) 3.1416)
)

; 5
( defun ar-romb ( D d) 
    (/ (* D d ) 2)
)

; 6 
( defun ar-para ( b h)
    (* b h)
)

; 7
( defun ar-trap (B b h)
    (/(* (+ B b) h) 2)
)

; 8
( defun ar-pent (P p a)
    (/(* (* P p) a) 2)
)

; 9
( defun ar-hexa (P p a)
    (/(* (* P p) a) 2)
)

; 9
( defun ar-elip (a b)
    (* (* a b) 3.1416)
)